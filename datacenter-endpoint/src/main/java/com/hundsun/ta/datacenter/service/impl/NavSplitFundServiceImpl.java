/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.service.impl;

import com.hundsun.ta.datacenter.daointerface.NavSplitFundDOMapper;
import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
import com.hundsun.ta.datacenter.service.NavSplitFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangpeng17355
 * @version $Id: SystemParameterService, v0.1 2018年11月15日 5:26 PM wangpeng17355 Exp $
 */
@Service(value = "navSplitFundService")
public class NavSplitFundServiceImpl implements NavSplitFundService {

    @Autowired
    private NavSplitFundDOMapper navSplitFundDOMapper;

    @Override public int insert(NavSplitFundDO navSplitFundDO) {
       int result = 1;
       try {
           result = navSplitFundDOMapper.insert(navSplitFundDO);
       }catch (Exception e)
       {
           throw e;
       }
       return result ;

    }

    @Override public List<NavSplitFundDO> selectAllData() {

      return   navSplitFundDOMapper.selectAllData();
    }

}