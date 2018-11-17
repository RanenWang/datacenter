package com.hundsun.ta.datacenter.controller;

/**
 * @author wangpeng17355
 * @version $Id: NavSplit, v0.1 2018年11月16日 10:03 PM wangpeng17355 Exp $
 */

import com.alibaba.common.lang.StringUtil;
import com.alipay.rdf.file.interfaces.FileFactory;
import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;
import com.hundsun.ta.datacenter.enums.ResultStatusEnum;
import com.hundsun.ta.datacenter.enums.SplitTypeEnum;
import com.hundsun.ta.datacenter.enums.SystemParamterClassEnum;
import com.hundsun.ta.datacenter.enums.SystemParamterItemEnum;
import com.hundsun.ta.datacenter.model.RequestResult;
import com.hundsun.ta.datacenter.service.SystemParameterService;
import com.hundsun.ta.datacenter.service.impl.SystemParameterServiceImpl;
import com.hundsun.ta.datacenter.utils.DESUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.task.TaskExecutorBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangpeng17355
 * @version $Id: SystemParamterController, v0.1 2018年11月15日 5:40 PM wangpeng17355 Exp $
 */
@Controller
@RequestMapping(value = "/split")
public class NavSplit {

    @Autowired
    SystemParameterService systemParameterService;

    /**
     * Split request result.
     *
     * @return the request result
     * @throws IOException the io exception
     */
    @ResponseBody
    @RequestMapping(value = "/getnavpath", produces = { "application/json;charset=UTF-8" })
    public RequestResult split() throws IOException {
        RequestResult requestResult = new RequestResult();
        // step1: 直接取数据库路径
        String filePath = systemParameterService.getNavPath(SystemParamterItemEnum.NAVPATH.getCode(),SystemParamterItemEnum.NAVNAME.getCode(),SystemParamterItemEnum.INCOMEDATE.getCode());
        if (StringUtil.isBlank(filePath)){
            requestResult.setStatus(ResultStatusEnum.FAIL.getCode());
            requestResult.setMessage("【警告】行情路径获取失败！！");
        }
        else{
            requestResult.setStatus(ResultStatusEnum.SUCCESS.getCode());
            requestResult.setData(filePath);
        }
        return requestResult;
    }

    /**
     * Navsplit request result.
     *
     * @param filePath the file path
     * @param ta4Path  the ta 4 path
     * @param etfPath  the etf path
     * @param rttaPath the rtta path
     * @return the request result
     * @throws Exception the exception
     */
    @ResponseBody
    @RequestMapping(value = "/navsplit", produces = {"application/json;charset=UTF-8"})
    public RequestResult navsplit(@RequestParam("navpath") String filePath,@RequestParam("ta4path") String ta4Path,@RequestParam("etfpath") String etfPath,@RequestParam("rttapath") String rttaPath) throws Exception {
        RequestResult requestResult = new RequestResult();
        // 获取系统参数
        String splitTypeDES =  systemParameterService.getSplitType();
        String splitType = DESUtil.decrypt(splitTypeDES);
        // TODO: 2018/11/17 判断几系统逻辑
        switch (splitType){
            case "ETFANDTA4":
                splitEtfAndTa4(filePath,etfPath,ta4Path);
                break;
            case "TA4ANDYJTA":
                splitTa4AndYjta(filePath,ta4Path,rttaPath);
                break;
            case "TA4ANDRTTA":
                splitTa4AndRtta(filePath,ta4Path,rttaPath);
                break;
            case "ETFANDTA4ANDYJTA":
                SplitEtfAndTa4AndYjta(filePath,etfPath,ta4Path,rttaPath);
                break;
            default:
                break;
        }
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            requestResult.setStatus(ResultStatusEnum.FAIL.getCode());
            requestResult.setMessage("【警告】未找到文件【"+filePath +"】！！异常："+e);
            return requestResult;
        }
        BufferedReader br =
                new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
        // TODO: 2018/11/17 step2: 获取拆分表数据 nav_split_fund
        // TODO: 2018/11/17 step3: 获取是否三系统拆分标记
        // TODO: 2018/11/17 step4: 连接获取分TA基金列表
        // TODO: 2018/11/17 step5: 获取TA4基金列表
        // TODO: 2018/11/17 step6: 获取实时TA基金列表
        // TODO: 2018/11/17


        String line = br.readLine();
        String result = "";
        while (line!=null){
            result += line+ "\n";

            // TODO: 2018/11/17 拆分处理
            // TODO: 2018/11/17 获取
            line = br.readLine();
        }
        requestResult.setStatus(ResultStatusEnum.SUCCESS.getCode());
        requestResult.setMessage("拆分成功！！");
        return requestResult;
    }

    /**
     * 拆分etf，ta4，瑜伽云TA
     * @param filePath
     * @param etfPath
     * @param ta4Path
     * @param rttaPath
     */
    private void SplitEtfAndTa4AndYjta(String filePath, String etfPath, String ta4Path, String rttaPath) {
    }

    /**
     * 拆分ta4和实时TA
     * @param filePath
     * @param ta4Path
     * @param rttaPath
     */
    private void splitTa4AndRtta(String filePath, String ta4Path, String rttaPath) {
    }

    /**
     * 拆分ta4和瑜伽TA
     * @param filePath
     * @param ta4Path
     * @param rttaPath
     */
    private void splitTa4AndYjta(String filePath, String ta4Path, String rttaPath) {
    }

    /**
     * 拆分etf和ta4
     * @param filePath
     * @param etfPath
     * @param ta4Path
     */
    private void splitEtfAndTa4(String filePath, String etfPath, String ta4Path) {
    }
}