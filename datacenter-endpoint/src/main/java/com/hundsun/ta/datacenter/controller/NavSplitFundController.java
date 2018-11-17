package com.hundsun.ta.datacenter.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
import com.hundsun.ta.datacenter.enums.SplitTypeEnum;
import com.hundsun.ta.datacenter.service.NavSplitFundService;
import com.hundsun.ta.datacenter.service.SystemParameterService;

/**
 * @author wangpeng17355
 * @version $Id: SystemParamterController, v0.1 2018年11月15日 5:40 PM wangpeng17355 Exp $
 */
@Controller
@RequestMapping(value = "/navsplitfund")
public class NavSplitFundController {

    public static final int SUCCESS = 1;
    @Autowired
    SystemParameterService systemParameterService;
    @Autowired
    NavSplitFundService navSplitFundService;

    @ResponseBody
    @RequestMapping(value = "/insert", produces = {"application/json;charset=UTF-8"})
    public String insert(){
        String result = "";
        NavSplitFundDO navSplitFundDO = new NavSplitFundDO();
        navSplitFundDO.setFundCode("111111");
        navSplitFundDO.setGmtCreate(new Date());
        navSplitFundDO.setGmtModified(new Date());
        navSplitFundDO.setId(12);
        navSplitFundDO.setSplitType(SplitTypeEnum.ETFANDTA4.getCode());
        navSplitFundDO.setSubFundCode("213123");
        try{
            if(navSplitFundService.insert(navSplitFundDO) == SUCCESS)
                result = "SUCCESS";
            else
                result = "FAIL";
        }
        catch (Exception e)
        {
            result = "基金拆分列表插入失败!\n数据库异常:"+ e;
        }
        return  result;

    }
    @ResponseBody
    @RequestMapping(value = "/selectalldata", produces = {"application/json;charset=UTF-8"})
    public List<NavSplitFundDO> selectAllData(){
        return navSplitFundService.selectAllData();
    }
}