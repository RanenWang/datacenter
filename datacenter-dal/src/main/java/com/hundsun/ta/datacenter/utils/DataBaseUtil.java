/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import com.hundsun.ta.datacenter.daointerface.ETFSaleStatDOMapper;
import com.hundsun.ta.datacenter.dataobject.ETFSaleStatDO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author wangpeng17355
 * @version $Id: DataBaseUtil, v0.1 2018年11月17日 2:55 PM wangpeng17355 Exp $
 */
public class DataBaseUtil {

    public SqlSession getSqlSession(Properties properties) throws IOException {
        // 通过配置文件获取数据库连接信息
        InputStream stream = Resources.getResourceAsStream("META-INF/Configuration.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream,
                properties);
        // 通过sqlSessionFactory打开一个数据库会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
//
//    public static void main(String[] args) throws IOException {
//        // 通过配置文件获取数据库连接信息
//        InputStream stream = Resources.getResourceAsStream("META-INF/Configuration.xml");
//        /*
//        System.out.println(properties.getProperty("jdbc.driver"));
//        System.out.println(properties.getProperty("jdbc.url"));
//        System.out.println(properties.getProperty("jdbc.user"));
//        System.out.println(properties.getProperty("jdbc.password"));
//        */
//        DBProperties dbProperties = new DBProperties();
//        Properties MG01 = new Properties();
//        MG01.setProperty("jdbc.driver", "oracle.jdbc.driver.OracleDriver");
//        MG01.setProperty("jdbc.url", "jdbc:oracle:thin:@192.168.74.170:1521/ora11g");
//        MG01.setProperty("jdbc.user", "fkfta");
//        MG01.setProperty("jdbc.password", "fkfta");
//        dbProperties.setETF(MG01);
//        // 通过配置信息构建一个SQLSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream,
//                dbProperties.ETF);
//        // 通过sqlSessionFactory打开一个数据库会话
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        ETFSaleStatDOMapper etfSaleStatDOMapper =  sqlSession.getMapper(ETFSaleStatDOMapper.class);
//        List<ETFSaleStatDO> etfSaleStatDOS =  etfSaleStatDOMapper.selectAllData();
//        int a = 0;
//    }


}