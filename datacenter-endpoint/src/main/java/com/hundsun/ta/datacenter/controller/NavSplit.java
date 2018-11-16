/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.controller;

/**
 * @author wangpeng17355
 * @version $Id: NavSplit, v0.1 2018年11月16日 10:03 PM wangpeng17355 Exp $
 */

import com.alipay.rdf.file.interfaces.FileFactory;
import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
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
@RequestMapping(value = "/navsplit")
public class NavSplit {

    @ResponseBody
    @RequestMapping(value = "/split", produces = { "application/json;charset=UTF-8" })
    public String split() throws IOException {
        // TODO: 2018/11/16 直接取数据库路径
        String filePath = "/Users/ranen/Desktop/navtest/CHANGXIN/NAV20180914";
        File file = new File(filePath);
        FileReader fileReader = new FileReader(filePath);
        BufferedReader br =
        new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
        
        String line = br.readLine();
        String result = line + "\n";
        while (line!=null){
            line = br.readLine();
            result += line+ "\n";
        }
        return result;
    }
}