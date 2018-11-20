/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.utils;

import com.hundsun.ta.datacenter.daointerface.DatabaseConfigDOMapper;
import com.hundsun.ta.datacenter.dataobject.DatabaseConfigDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Properties;

/**
 * @author wangpeng17355
 * @version $Id: DBProperties, v0.1 2018年11月17日 2:57 PM wangpeng17355 Exp $
 */
@Configuration
@Component
public class DBProperties {

    @Autowired
    private DatabaseConfigDOMapper databaseConfigDOMapper;

    public static Properties       ETF;
    public static Properties       TA4;
    public static Properties       RTTA;
    public static Properties       DATACENTER;
    public static final String     ETF_TYPE        = "ETF";
    public static final String     TA4_TYPE        = "TA4";
    public static final String     RTTA_TYPE       = "RTTA";
    public static final String     DATACENTER_TYPE = "DATACENTER";

    public DBProperties() throws Exception {
        this.ETF = new Properties();
        this.TA4 = new Properties();
        this.RTTA = new Properties();
        this.DATACENTER = new Properties();

        //  InitProperties();
    }

    /**
    /**
     * 初始化数据库配置信息
     * 连接数据库读取全部数据库配置信息
     * @return
     */
    public int InitProperties() throws Exception {
        //读取全部数据
        List<DatabaseConfigDO> databaseConfigDOSList = databaseConfigDOMapper.selectAllData();
        for (DatabaseConfigDO databaseConfigDO : databaseConfigDOSList) {
            if (!StringUtils.isEmpty(databaseConfigDO.getIp())
                && !StringUtils.isEmpty(databaseConfigDO.getServerName())
                && !StringUtils.isEmpty(databaseConfigDO.getUserName()))
                if (ETF_TYPE.equals(databaseConfigDO.getSystemType())) {
                    this.ETF.setProperty("jdbc.driver", "oracle.jdbc.driver.OracleDriver");
                    this.ETF.setProperty("jdbc.url", "jdbc:oracle:thin:@" + databaseConfigDO.getIp()
                                                     + "/" + databaseConfigDO.getServerName());
                    this.ETF.setProperty("jdbc.user", databaseConfigDO.getUserName());
                    this.ETF.setProperty("jdbc.password",
                        DESUtil.decrypt(databaseConfigDO.getPassWord()));
                } else if (TA4_TYPE.equals(databaseConfigDO.getSystemType())) {
                    this.TA4.setProperty("jdbc.driver", "oracle.jdbc.driver.OracleDriver");
                    this.TA4.setProperty("jdbc.url", "jdbc:oracle:thin:@" + databaseConfigDO.getIp()
                                                     + "/" + databaseConfigDO.getServerName());
                    this.TA4.setProperty("jdbc.user", databaseConfigDO.getUserName());
                    this.TA4.setProperty("jdbc.password",
                        DESUtil.decrypt(databaseConfigDO.getPassWord()));
                } else if (RTTA_TYPE.equals(databaseConfigDO.getSystemType())) {
                    this.RTTA.setProperty("jdbc.driver", "oracle.jdbc.driver.OracleDriver");
                    this.RTTA.setProperty("jdbc.url", "jdbc:oracle:thin:@" + databaseConfigDO.getIp()
                                                     + "/" + databaseConfigDO.getServerName());
                    this.RTTA.setProperty("jdbc.user", databaseConfigDO.getUserName());
                    this.RTTA.setProperty("jdbc.password",
                        DESUtil.decrypt(databaseConfigDO.getPassWord()));
                } else if (DATACENTER_TYPE.equals(databaseConfigDO.getSystemType())) {
                    this.DATACENTER.setProperty("jdbc.driver", "com.mysql.jdbc.Driver");
                    this.DATACENTER.setProperty("jdbc.url", "jdbc:mysql://" + databaseConfigDO.getIp()
                                                     + "/" + databaseConfigDO.getServerName());
                    this.DATACENTER.setProperty("jdbc.user", databaseConfigDO.getUserName());
                    this.DATACENTER.setProperty("jdbc.password",
                        DESUtil.decrypt(databaseConfigDO.getPassWord()));
                } else {
                    Throwable throwable = new Throwable("未知系统类型");
                }
        }
        return 0;
    }

    //    public static void main(String[] args) throws Exception {
    //        DESUtil.encrypt("616455481wp");
    //        //5JOO7F9Rq3HBd/jviLZHfw==
    //        return;
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