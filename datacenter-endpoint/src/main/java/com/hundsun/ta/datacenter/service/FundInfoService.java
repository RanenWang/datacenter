package com.hundsun.ta.datacenter.service;

import java.io.IOException;
import java.util.List;

import com.hundsun.ta.datacenter.dataobject.ETFFundInfoDO;
import com.hundsun.ta.datacenter.dataobject.FundCodeDO;
import com.hundsun.ta.datacenter.dataobject.NavSplitFundDO;
import org.springframework.stereotype.Service;

/**
 * 获取基金列表服务
 * @author wangpeng17355
 * @version $Id: SystemParameterService, v0.1 2018年11月15日 5:26 PM wangpeng17355 Exp $
 */
public interface FundInfoService {
    /**
     * 获取 etf 基金列表
     * @return
     */
    List<FundCodeDO> getEtfFundCodeList() throws Exception;

    /**
     * 获取 ta4 基金列表
     * @return
     */
    List<FundCodeDO> getTa4FundCodeList() throws Exception;

    /**
     * 获取 实时TA 基金列表
     * @return
     */
    List<FundCodeDO> getRttaFundCodeList() throws Exception;
}