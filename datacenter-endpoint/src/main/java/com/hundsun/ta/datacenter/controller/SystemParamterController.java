package com.hundsun.ta.datacenter.controller;
import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;
import com.hundsun.ta.datacenter.enums.SplitTypeEnum;
import com.hundsun.ta.datacenter.service.NavSplitFundService;
import com.hundsun.ta.datacenter.service.SystemParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author wangpeng17355
 * @version $Id: SystemParamterController, v0.1 2018年11月15日 5:40 PM wangpeng17355 Exp $
 */
@Controller
@RequestMapping(value = "/system")
public class SystemParamterController{

    @Autowired
    SystemParameterService systemParameterService;
    @Autowired
    NavSplitFundService navSplitFundService;

    @ResponseBody
    @RequestMapping(value = "/getbykey", produces = {"application/json;charset=UTF-8"})
    public SystemParameterDO getsys(){
        return  systemParameterService.selectByPrimaryKey(1);

    }
    @ResponseBody
    @RequestMapping(value = "/updatesys", produces = {"application/json;charset=UTF-8"})
    public String updateByClassAndItem(@RequestParam("class")String sysclass,@RequestParam("item") String sysitem,@RequestParam("value") String sysvalue){

        SystemParameterDO systemParameterDO = new SystemParameterDO();
        systemParameterDO.setClassName(sysclass);
        systemParameterDO.setItem(sysitem);
        systemParameterDO.setParamValue(sysvalue);
        systemParameterService.updateByClassAndItem(systemParameterDO);
        return "SUCCESS";
    }
}