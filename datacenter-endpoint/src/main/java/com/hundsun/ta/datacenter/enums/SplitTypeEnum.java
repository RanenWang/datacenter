/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.enums;

import com.alibaba.common.lang.StringUtil;

/**
 * @author wangpeng17355
 * @version $Id: SplitTypeEnum, v0.1 2018年11月16日 6:59 PM wangpeng17355 Exp $
 */
public enum SplitTypeEnum {

    ETFANDTA4("1","ETFANDTA4","分TA和自建合并"),
    TA4ANDYJTA("2","TA4ANDYJTA","分TA和自建合并"),
    TA4ANDRTTA("3","TA4ANDRTTA","分TA和自建合并"),
    ETFANDTA4ANDYJTA("4","ETFANDTA4ANDYJTA","分TA和自建合并");

    String code;
    String describ;
    String name;

    SplitTypeEnum(String code, String name,String describ)
    {
        this.code = code;
        this.describ = describ;
        this.name = name;
    }

    /**
     * 通过code获取item
     * @param code
     * @return
     */
    public static SplitTypeEnum getByCode(String code) {
        if (StringUtil.isBlank(code)) {
            return null;
        } else {
            SplitTypeEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                SplitTypeEnum item = var1[var3];
                if (StringUtil.equals(item.getCode(), code)) {
                    return item;
                }
            }

            return null;
        }
    }

    /**
     * Getter method for property <tt>describ</tt>.
     *
     * @return property value of describ
     */
    public String getDescrib() {
        return describ;
    }

    /**
     * Setter method for property <tt>describ</tt>.
     *
     * @param describ value to be assigned to property describ
     */
    public void setDescrib(String describ) {
        this.describ = describ;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }
}