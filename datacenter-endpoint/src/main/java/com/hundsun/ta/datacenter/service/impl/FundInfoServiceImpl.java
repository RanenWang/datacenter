/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.service.impl;

import com.hundsun.ta.datacenter.daointerface.ETFFundInfoDOMapper;
import com.hundsun.ta.datacenter.daointerface.RttaFundInfoDOMapper;
import com.hundsun.ta.datacenter.daointerface.TA4FundInfoDOMapper;
import com.hundsun.ta.datacenter.dataobject.FundCodeDO;
import com.hundsun.ta.datacenter.service.FundInfoService;
import com.hundsun.ta.datacenter.utils.DBProperties;
import com.hundsun.ta.datacenter.utils.DataBaseUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author wangpeng17355
 * @version $Id: FundinfoServiceImpl, v0.1 2018年11月19日 7:29 PM wangpeng17355 Exp $
 */
@Service(value = "fundInfoService")
public class FundInfoServiceImpl implements FundInfoService {

    @Autowired DBProperties dbProperties;

    /**
     * 连接ETF分TA获取基金列表所有数据
     * @return
     * @throws Exception
     */
    @Override public List<FundCodeDO> getEtfFundCodeList() throws Exception {
        //DBProperties dbProperties = new DBProperties();
        dbProperties.InitProperties();
        SqlSession sqlSession = DataBaseUtil.getSqlSession(dbProperties.ETF);
        ETFFundInfoDOMapper etfFundInfoDOMapper = sqlSession.getMapper(ETFFundInfoDOMapper.class);
        return  etfFundInfoDOMapper.getAllFundCode();
    }

    /**
     * 连接TA4获取基金列表所有数据
     * @return
     */
    @Override public List<FundCodeDO> getTa4FundCodeList()  throws Exception {
        dbProperties.InitProperties();
        SqlSession sqlSession = DataBaseUtil.getSqlSession(dbProperties.TA4);
        TA4FundInfoDOMapper ta4FundInfoDOMapper = sqlSession.getMapper(TA4FundInfoDOMapper.class);
        return  ta4FundInfoDOMapper.getAllFundCode();
    }

    /**
     * 取datacenter表数据获取瑜伽将要拆分的基金数据
     * @return
     */
    @Override public List<FundCodeDO> getRttaFundCodeList()  throws Exception {

        dbProperties.InitProperties();
        SqlSession sqlSession = DataBaseUtil.getSqlSession(dbProperties.RTTA);
        RttaFundInfoDOMapper rttaFundInfoDOMapper = sqlSession.getMapper(RttaFundInfoDOMapper.class);
        return  rttaFundInfoDOMapper.getAllFundCode();
    }
}