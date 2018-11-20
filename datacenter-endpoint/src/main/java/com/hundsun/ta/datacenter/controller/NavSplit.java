package com.hundsun.ta.datacenter.controller;

import com.alibaba.common.lang.StringUtil;
import com.hundsun.ta.datacenter.dataobject.FundCodeDO;
import com.hundsun.ta.datacenter.enums.ResultStatusEnum;
import com.hundsun.ta.datacenter.enums.SystemParamterItemEnum;
import com.hundsun.ta.datacenter.model.RequestResult;
import com.hundsun.ta.datacenter.service.FundInfoService;
import com.hundsun.ta.datacenter.service.SystemParameterService;
import com.hundsun.ta.datacenter.utils.DESUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.*;
import java.util.*;

/**
 * 拆分控制器
 * @author wangpeng17355
 * @version $Id: SystemParamterController, v0.1 2018年11月15日 5:40 PM wangpeng17355 Exp $
 */
@Controller
@RequestMapping(value = "/split")
public class NavSplit {

    @Autowired
    SystemParameterService systemParameterService;

    @Autowired
    FundInfoService        fundInfoService;

    /**
     * 获取nav路径
     * @return the request result
     * @throws IOException the io exception
     */
    @ResponseBody
    @RequestMapping(value = "/getnavpath", produces = { "application/json;charset=UTF-8" })
    public RequestResult split() throws IOException {
        RequestResult requestResult = new RequestResult();
        // step1: 直接取数据库路径
        String filePath = systemParameterService.getNavPath(
            SystemParamterItemEnum.NAVPATH.getCode(), SystemParamterItemEnum.NAVNAME.getCode(),
            SystemParamterItemEnum.INCOMEDATE.getCode());
        if (StringUtil.isBlank(filePath)) {
            requestResult.setStatus(ResultStatusEnum.FAIL.getCode());
            requestResult.setMessage("【警告】行情路径获取失败！！");
        } else {
            requestResult.setStatus(ResultStatusEnum.SUCCESS.getCode());
            requestResult.setData(filePath);
        }
        return requestResult;
    }

    /**
     * 执行行情拆分逻辑
     *
     * @param filePath the file path
     * @param ta4Path  the ta 4 path
     * @param etfPath  the etf path
     * @param rttaPath the rtta path
     * @return the request result
     * @throws Exception the exception
     */
    @ResponseBody
    @RequestMapping(value = "/navsplit", produces = { "application/json;charset=UTF-8" })
    public RequestResult navsplit(@RequestParam("navpath") String filePath,
                                  @RequestParam("ta4path") String ta4Path,
                                  @RequestParam("etfpath") String etfPath,
                                  @RequestParam("rttapath") String rttaPath) throws Exception {
        RequestResult requestResult = new RequestResult();
        // 获取系统参数
        String splitTypeDES = systemParameterService.getSplitType();
        String splitType = DESUtil.decrypt(splitTypeDES);
        // STEP 1 : 判断几系统逻辑
        switch (splitType) {
            case "ETFANDTA4":
                //etf和ta4
                splitEtfAndTa4(filePath, etfPath, ta4Path);
                break;
            case "TA4ANDYJTA":
                //ta4和瑜伽TA
                splitTa4AndYjta(filePath, ta4Path, rttaPath);
                break;
            case "TA4ANDRTTA":
                //ta4和实时TA
                splitTa4AndRtta(filePath, ta4Path, rttaPath);
                break;
            case "ETFANDTA4ANDYJTA":
                //etf、ta4、瑜伽TA
                try {
                    splitEtfAndTa4AndYjta(filePath, etfPath, ta4Path, rttaPath);
                } catch (FileNotFoundException e) {
                    requestResult.setStatus(ResultStatusEnum.FAIL.getCode());
                    requestResult.setMessage("【警告】未找到文件【" + filePath + "】！！异常：" + e);
                    return requestResult;
                }
                break;
            case "ETFANDTA4ANDRTTA":
                //etf、ta4、实时TA
                SplitEtfAndTa4AndRtta(filePath, etfPath, ta4Path, rttaPath);
                break;
            default:
                break;
        }

        requestResult.setStatus(ResultStatusEnum.SUCCESS.getCode());
        requestResult.setMessage("拆分成功！！");
        return requestResult;
    }

    /**
     * 拆分分TA、TA4、瑜伽TA三系统数据
     *
     * @param filePath
     * @param etfPath
     * @param ta4Path
     * @param rttaPath
     */
    private void splitEtfAndTa4AndYjta(String filePath, String etfPath, String ta4Path,
                                       String rttaPath) throws Exception {
        // step 1 : 获取基金列表
        // 【TA4基金列表】
        // 【分TA基金列表】
        // 【瑜伽需要拆分的TA列表】
        List<FundCodeDO> ta4FundCodeList = new ArrayList<>(100);
        List<FundCodeDO> etfFundCodeList = new ArrayList<>(100);
        List<FundCodeDO> rttaFundCodeList = new ArrayList<>(100);

        etfFundCodeList = fundInfoService.getEtfFundCodeList();
        ta4FundCodeList = fundInfoService.getTa4FundCodeList();
        rttaFundCodeList = fundInfoService.getRttaFundCodeList();

        // step 2 :获取nav文件buffer对象。
        BufferedReader navReader = new BufferedReader(
            new InputStreamReader(new FileInputStream(new File(filePath)), "GBK"));
        // TODO: 2018/11/17 step2: 获取拆分表数据 nav_split_fund
        // TODO: 2018/11/17 step3: 获取是否三系统拆分标记
        // TODO: 2018/11/17 step4: 连接获取分TA基金列表
        // TODO: 2018/11/17 step5: 获取TA4基金列表
        // TODO: 2018/11/17 step6: 获取实时TA基金列表
        // TODO: 2018/11/17

        String line = navReader.readLine();
        String result = "";
        while (line != null) {
            result += line + "\n";

            // TODO: 2018/11/17 拆分处理
            // TODO: 2018/11/17 获取
            line = navReader.readLine();
        }

    }

    /**
     * 拆分ta4和实时TA
     * @param filePath
     * @param ta4Path
     * @param rttaPath
     */
    private int splitTa4AndRtta(String filePath, String ta4Path, String rttaPath) {
        return 0;
    }

    /**
     * 拆分ta4和瑜伽TA
     * @param filePath
     * @param ta4Path
     * @param rttaPath
     */
    private int splitTa4AndYjta(String filePath, String ta4Path, String rttaPath) {
        return 1;
    }

    /**
     * 拆分etf和ta4
     * @param filePath
     * @param etfPath
     * @param ta4Path
     */
    private void splitEtfAndTa4(String filePath, String etfPath, String ta4Path) {
    }

    /**
     * ETF TA4 实时TA三系统拆分
     *
     * @param filePath
     * @param etfPath
     * @param ta4Path
     * @param rttaPath
     */
    private void SplitEtfAndTa4AndRtta(String filePath, String etfPath, String ta4Path,
                                       String rttaPath) {

    }

}