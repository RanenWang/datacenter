package com.hundsun.ta.datacenter.enums;

/**
 * 系统参数类别
 * @author wangpeng17355
 * @version $Id: SystemParamterClassEnum, v0.1 2018年11月15日 10:23 PM wangpeng17355 Exp $
 */
import com.alibaba.common.lang.StringUtil;

public enum SystemParamterClassEnum {
    PARAMTER("PARAMTER","系统参数"),
    PATH("PATH", "路径配置"),
    VERSION("VERSION", "版本配置");

    String code;
    String desc;

    private SystemParamterClassEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static SystemParamterClassEnum getByCode(String code) {
        if (StringUtil.isBlank(code)) {
            return null;
        } else {
            SystemParamterClassEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                SystemParamterClassEnum item = var1[var3];
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
