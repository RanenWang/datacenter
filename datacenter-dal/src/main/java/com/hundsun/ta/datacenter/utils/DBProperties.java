/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.utils;

import com.hundsun.ta.datacenter.daointerface.DatabaseConfigDOMapper;
import com.hundsun.ta.datacenter.daointerface.SystemParameterDOMapper;
import com.hundsun.ta.datacenter.dataobject.DatabaseConfigDO;
import com.sun.org.apache.xml.internal.security.Init;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.security.PublicKey;
import java.util.List;
import java.util.Properties;

/**
 * @author wangpeng17355
 * @version $Id: DBProperties, v0.1 2018年11月17日 2:57 PM wangpeng17355 Exp $
 */
@Component
public class DBProperties {
    @Autowired
    private DatabaseConfigDOMapper databaseConfigDOMapper;

    public static Properties       ETF;
    public static Properties       TA4;
    public static Properties       RTTA;
    public static Properties       DATACENTER;
    public static final String ETF_TYPE = "ETF";
    public static final String TA4_TYPE = "TA4";
    public static final String RTTA_TYPE = "RTTA";
    public static final String DATACENTER_TYPE = "DATACENTER";

    public DBProperties() {
        this.ETF = new Properties();
        this.TA4 = new Properties();
        this.RTTA = new Properties();
        this.DATACENTER = new Properties();
    }

    /**
     * 初始化数据库配置信息
     * @return
     */
    public int InitProperties(){
        //读取全部数据
        List<DatabaseConfigDO> databaseConfigDOSList = databaseConfigDOMapper.selectAllData();
        for(DatabaseConfigDO databaseConfigDO : databaseConfigDOSList){
            if (databaseConfigDO.getSystemType().equals(ETF_TYPE)){

            }else if(databaseConfigDO.getSystemType().equals(TA4_TYPE)) {

            }else if(databaseConfigDO.getSystemType().equals(RTTA_TYPE)) {

            }else if(databaseConfigDO.getSystemType().equals(DATACENTER_TYPE)) {

            }else{
                Throwable throwable = new Throwable("未知系统类型");
            }
        }
        return 0;
    }

    //    static{
    //
    //        MG01 = new Properties();
    //        MG01.setProperty("jdbc.driver", "oracle.jdbc.driver.OracleDriver");
    //        MG01.setProperty("jdbc.url", "jdbc:oracle:thin:@192.168.0.0:1521/mg01");
    //        MG01.setProperty("jdbc.user", "xxx");
    //        MG01.setProperty("jdbc.password", "xxx");
    //
    //        CS15 = new Properties();
    //        CS15.setProperty("jdbc.driver", "oracle.jdbc.driver.OracleDriver");
    //        CS15.setProperty("jdbc.url", "jdbc:oracle:thin:@192.168.0.0:1521/mg15");
    //        CS15.setProperty("jdbc.user", "xxx");
    //        CS15.setProperty("jdbc.password", "xxx");
    //    }

    /**
     * Getter method for property <tt>ETF</tt>.
     *
     * @return property value of ETF
     */
    public Properties getETF() {
        return ETF;

    }

    /**
     * Setter method for property <tt>ETF</tt>.
     *
     * @param ETF value to be assigned to property ETF
     */
    public void setETF(Properties ETF) {
        this.ETF = ETF;
    }

    /**
     * Getter method for property <tt>TA4</tt>.
     *
     * @return property value of TA4
     */
    public Properties getTA4() {
        return TA4;
    }

    /**
     * Setter method for property <tt>TA4</tt>.
     *
     * @param TA4 value to be assigned to property TA4
     */
    public void setTA4(Properties TA4) {
        this.TA4 = TA4;
    }

    /**
     * Getter method for property <tt>RTTA</tt>.
     *
     * @return property value of RTTA
     */
    public Properties getRTTA() {
        return RTTA;
    }

    /**
     * Setter method for property <tt>RTTA</tt>.
     *
     * @param RTTA value to be assigned to property RTTA
     */
    public void setRTTA(Properties RTTA) {
        this.RTTA = RTTA;
    }

    /**
     * Getter method for property <tt>DATACENTER</tt>.
     *
     * @return property value of DATACENTER
     */
    public Properties getDATACENTER() {
        return DATACENTER;
    }

    /**
     * Setter method for property <tt>DATACENTER</tt>.
     *
     * @param DATACENTER value to be assigned to property DATACENTER
     */
    public void setDATACENTER(Properties DATACENTER) {
        this.DATACENTER = DATACENTER;
    }
}