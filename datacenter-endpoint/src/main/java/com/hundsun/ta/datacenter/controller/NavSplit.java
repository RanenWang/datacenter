package com.hundsun.ta.datacenter.controller;

/**
 * @author wangpeng17355
 * @version $Id: NavSplit, v0.1 2018年11月16日 10:03 PM wangpeng17355 Exp $
 */

import com.alipay.rdf.file.interfaces.FileFactory;
import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;
import com.hundsun.ta.datacenter.enums.SystemParamterClassEnum;
import com.hundsun.ta.datacenter.enums.SystemParamterItemEnum;
import com.hundsun.ta.datacenter.service.SystemParameterService;
import com.hundsun.ta.datacenter.service.impl.SystemParameterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    @Autowired SystemParameterService systemParameterService;
    @ResponseBody
    @RequestMapping(value = "/navsplit", produces = { "application/json;charset=UTF-8" })
    public String split() throws IOException {
        // step1: 直接取数据库路径
        String filePath = systemParameterService.getNavPath(SystemParamterItemEnum.NAVPATH.getCode(),SystemParamterItemEnum.NAVNAME.getCode(),SystemParamterItemEnum.INCOMEDATE.getCode());
        File file = new File(filePath);
        FileReader fileReader = new FileReader(filePath);
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
        return result;
    }
}