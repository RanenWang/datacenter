/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.utils;

import com.hundsun.ta.datacenter.dataobject.FundCodeDO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wangpeng17355
 * @version $Id: MainTest, v0.1 2018年11月19日 7:22 PM wangpeng17355 Exp $
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        long start = 0;
        long end = 0;
        Date startdate = new Date();
        long stattd = System.currentTimeMillis();
        System.gc();
        start = Runtime.getRuntime().freeMemory();
        Thread.sleep(10000);
        List<FundCodeDO> ta4FundCodeList = new ArrayList<>(100);
        for (int i=0 ; i < 2000000;i++){
            FundCodeDO fundCodeDO = new FundCodeDO();
            fundCodeDO.setFundCode("270005");
            fundCodeDO.setFundName("广发基金测试基金名称");
            ta4FundCodeList.add(fundCodeDO);


        }
        Date endDate = new Date();
        long endd =  System.currentTimeMillis();
        System.out.println(endd-stattd);
        System.out.println(endDate.toString() + "::::"+ startdate.toString());
        Thread.sleep(1000000);
        System.gc();

        System.out.println("对象内存:" + (start - end)/1000.0 + " KB");

    }
//
//
//        public static void main1(String[] args) throws IOException {
//            // 通过配置文件获取数据库连接信息
//            InputStream stream = Resources.getResourceAsStream("META-INF/Configuration.xml");
//            /*
//            System.out.println(properties.getProperty("jdbc.driver"));
//            System.out.println(properties.getProperty("jdbc.url"));
//            System.out.println(properties.getProperty("jdbc.user"));
//            System.out.println(properties.getProperty("jdbc.password"));
//            */
//            DBProperties dbProperties = new DBProperties();
//            Properties MG01 = new Properties();
//            MG01.setProperty("jdbc.driver", "oracle.jdbc.driver.OracleDriver");
//            MG01.setProperty("jdbc.url", "jdbc:oracle:thin:@192.168.74.170:1521/ora11g");
//            MG01.setProperty("jdbc.user", "fkfta");
//            MG01.setProperty("jdbc.password", "fkfta");
//            dbProperties.setETF(MG01);
//            // 通过配置信息构建一个SQLSessionFactory
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream,
//                    dbProperties.ETF);
//            // 通过sqlSessionFactory打开一个数据库会话
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            ETFSaleStatDOMapper etfSaleStatDOMapper =  sqlSession.getMapper(ETFSaleStatDOMapper.class);
//            List<ETFSaleStatDO> etfSaleStatDOS =  etfSaleStatDOMapper.selectAllData();
//            int a = 0;
//        }


}