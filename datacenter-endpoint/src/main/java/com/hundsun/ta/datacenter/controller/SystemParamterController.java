/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.controller;
import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;
import com.hundsun.ta.datacenter.enums.SplitTypeEnum;
import com.hundsun.ta.datacenter.service.NavSplitFundService;
import com.hundsun.ta.datacenter.service.SystemParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author wangpeng17355
 * @version $Id: SystemParamterController, v0.1 2018年11月15日 5:40 PM wangpeng17355 Exp $
 */
@Controller
@RequestMapping(value = "/sys")
public class SystemParamterController{

    @Autowired
    SystemParameterService systemParameterService;
    @Autowired
    NavSplitFundService navSplitFundService;

    @ResponseBody
    @RequestMapping(value = "/get", produces = {"application/json;charset=UTF-8"})
    public String getsys(){

       // return  navSplitFundService.selectAllData().toString();
        NavSplitFundDO navSplitFundDO = new NavSplitFundDO();
        navSplitFundDO.setFundCode("111111");
        navSplitFundDO.setGmtCreate(new Date());
        navSplitFundDO.setGmtModified(new Date());
        navSplitFundDO.setId(12);
        navSplitFundDO.setSplitType(SplitTypeEnum.ETFANDTA4.getCode());
        navSplitFundDO.setSubFundCode("213123");

        navSplitFundService.insert(navSplitFundDO);
        return  systemParameterService.selectByPrimaryKey(1).getClassName();

    }
}