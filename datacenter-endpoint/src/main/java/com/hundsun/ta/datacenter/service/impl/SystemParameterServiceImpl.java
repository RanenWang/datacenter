/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.service.impl;

import com.hundsun.ta.datacenter.daointerface.SystemParameterDOMapper;
import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;
import com.hundsun.ta.datacenter.enums.SystemParamterClassEnum;
import com.hundsun.ta.datacenter.enums.SystemParamterItemEnum;
import com.hundsun.ta.datacenter.service.SystemParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangpeng17355
 * @version $Id: SystemParameterService, v0.1 2018年11月15日 5:26 PM wangpeng17355 Exp $
 */
@Service(value = "systemParameterService")
public class SystemParameterServiceImpl implements SystemParameterService {

    @Autowired
    private SystemParameterDOMapper systemParameterDOMapper;

    @Override
    public SystemParameterDO selectByPrimaryKey(int id) {

        SystemParameterDO systemParameterDO = new SystemParameterDO();
        systemParameterDO = systemParameterDOMapper.selectByPrimaryKey(1);
        return systemParameterDO;

    }

    @Override public int updateByClassAndItem(SystemParameterDO systemParameterDO) {
        systemParameterDOMapper.updateByClassAndItem(systemParameterDO);
        return 0;
    }

    @Override public List<SystemParameterDO> selectByClassAndItem(
            SystemParameterDO systemParameterDO) {

       return systemParameterDOMapper.selectByClassAndItem(systemParameterDO);

    }

    @Override public String getNavPath(String path, String name, String date) {
        SystemParameterDO systemParameterRequest = new SystemParameterDO();
        systemParameterRequest.setClassName(SystemParamterClassEnum.PATH.getCode());
        systemParameterRequest.setItem(path);
        List<SystemParameterDO> systemParameterDOSList = systemParameterDOMapper.selectByClassAndItem(systemParameterRequest);
        String filePath = systemParameterDOSList.get(0).getParamValue();
        systemParameterRequest.setClassName(SystemParamterClassEnum.PARAMTER.getCode());
        systemParameterRequest.setItem(name);
        systemParameterDOSList = systemParameterDOMapper.selectByClassAndItem(systemParameterRequest);
        filePath += systemParameterDOSList.get(0).getParamValue();
        systemParameterRequest.setClassName(SystemParamterClassEnum.PARAMTER.getCode());
        systemParameterRequest.setItem(date);
        systemParameterDOSList = systemParameterDOMapper.selectByClassAndItem(systemParameterRequest);
        filePath += systemParameterDOSList.get(0).getParamValue();
        return filePath;
    }

    @Override public String getNavRestPath(String path, String name, String date) {
        SystemParameterDO systemParameterRequest = new SystemParameterDO();
        systemParameterRequest.setClassName(SystemParamterClassEnum.PATH.getCode());
        systemParameterRequest.setItem(path);
        List<SystemParameterDO> systemParameterDOSList = systemParameterDOMapper.selectByClassAndItem(systemParameterRequest);
        String filePath = systemParameterDOSList.get(0).getParamValue();
        systemParameterRequest.setClassName(SystemParamterClassEnum.PARAMTER.getCode());
        systemParameterRequest.setItem(name);
        systemParameterDOSList = systemParameterDOMapper.selectByClassAndItem(systemParameterRequest);
        filePath += systemParameterDOSList.get(0).getParamValue();
        systemParameterRequest.setClassName(SystemParamterClassEnum.PARAMTER.getCode());
        systemParameterRequest.setItem(date);
        systemParameterDOSList = systemParameterDOMapper.selectByClassAndItem(systemParameterRequest);
        filePath += systemParameterDOSList.get(0).getParamValue();
        return filePath;    }

}