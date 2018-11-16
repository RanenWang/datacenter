/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.service;

import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
import com.hundsun.ta.datacenter.dataobject.SystemParameterDO;

import java.util.List;

/**
 * @author wangpeng17355
 * @version $Id: SystemParameterService, v0.1 2018年11月15日 5:26 PM wangpeng17355 Exp $
 */
public interface NavSplitFundService {

    int insert(NavSplitFundDO navSplitFundDO);

    List<NavSplitFundDO> selectAllData();

}