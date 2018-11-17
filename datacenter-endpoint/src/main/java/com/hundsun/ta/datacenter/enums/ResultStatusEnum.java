/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.enums;

import com.alibaba.common.lang.StringUtil;

/**
 * @author wangpeng17355
 * @version $Id: ResultStatusEnum, v0.1 2018年11月17日 10:51 AM wangpeng17355 Exp $
 */
public enum  ResultStatusEnum {

    SUCCESS("SUCCESS","成功"),
    FAIL("FAIL","失败");

    String code;
    String desc;

    private ResultStatusEnum(String code, String desc){
        this.code = code;
        this.desc = desc;

    }

    /**
     * 通过code获取item
     * @param code
     * @return
     */
    public static ResultStatusEnum getByCode(String code) {
        if (StringUtil.isBlank(code)) {
            return null;
        } else {
            ResultStatusEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ResultStatusEnum item = var1[var3];
                if (StringUtil.equals(item.getCode(), code)) {
                    return item;
                }
            }

            return null;
        }
    }




    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     *
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
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
}