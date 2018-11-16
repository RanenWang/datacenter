/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.enums;
import com.alibaba.common.lang.StringUtil;

/**
 * 系统参数控件类型
 * @author wangpeng17355
 * @version $Id: SystemParamterTypeEnum, v0.1 2018年11月15日 10:24 PM wangpeng17355 Exp $
 */
public enum SystemParamterTypeEnum {

    TEXT("0", "文本框"),
    SINGLE("1", "下拉框单选"),
    MULTI("2", "下拉框多选");

    String code;
    String desc;

    private SystemParamterTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static SystemParamterTypeEnum getByCode(String code) {
        if (StringUtil.isBlank(code)) {
            return null;
        } else {
            SystemParamterTypeEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                SystemParamterTypeEnum item = var1[var3];
                if (StringUtil.equals(item.getCode(), code)) {
                    return item;
                }
            }

            return null;
        }
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
