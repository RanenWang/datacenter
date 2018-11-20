package com.hundsun.ta.datacenter.enums;

/**
 * 系统表 item
 * @author wangpeng17355
 * @version $Id: SystemParamterItemEnum, v0.1 2018年11月15日 10:24 PM wangpeng17355 Exp $
 */
import com.alibaba.common.lang.StringUtil;

public enum SystemParamterItemEnum {
    TACODE("TACODE", "TA代码"),
    NAVPATH("NAVPATH","行情路径"),
    INCOMEDATE("INCOMEDATE","收益日期"),
    NAVNAME("NAVNAME","工作日行情文件前缀"),
    SPLITTYPE("SPLITTYPE","拆分类型");

    String code;
    String desc;

    private SystemParamterItemEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static SystemParamterItemEnum getByCode(String code) {
        if (StringUtil.isBlank(code)) {
            return null;
        } else {
            SystemParamterItemEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                SystemParamterItemEnum item = var1[var3];
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