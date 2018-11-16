/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hundsun.ta.datacenter.daointerface.SystemParameterDOMapper;
import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;
import com.hundsun.ta.datacenter.service.SystemParameterService;

/**
 * @author wangpeng17355
 * @version $Id: SystemParameterService, v0.1 2018年11月15日 5:26 PM wangpeng17355 Exp $
 */
@Service(value = "systemParameterService")
public class NavSplitFundServiceImpl implements SystemParameterService {

    @Autowired
    private SystemParameterDOMapper systemParameterDOMapper;

    @Override
    public SystemParameterDO selectByPrimaryKey(int id) {

        SystemParameterDO systemParameterDO = new SystemParameterDO();
        systemParameterDO = systemParameterDOMapper.selectByPrimaryKey(1);
        return systemParameterDO;

    }

}