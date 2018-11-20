/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.dataobject;

/**
 * @author wangpeng17355
 * @version $Id: FundCodeDO, v0.1 2018年11月19日 5:37 PM wangpeng17355 Exp $
 */
public class FundCodeDO {
   private String fundCode;
   private String fundName;

    /**
     * Getter method for property <tt>fundCode</tt>.
     *
     * @return property value of fundCode
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Setter method for property <tt>fundCode</tt>.
     *
     * @param fundCode value to be assigned to property fundCode
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    /**
     * Getter method for property <tt>fundName</tt>.
     *
     * @return property value of fundName
     */
    public String getFundName() {
        return fundName;
    }

    /**
     * Setter method for property <tt>fundName</tt>.
     *
     * @param fundName value to be assigned to property fundName
     */
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }}