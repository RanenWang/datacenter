package com.hundsun.ta.datacenter.enums;

/**
 * 用户可见权限
 * @author wangpeng17355
 * @version $Id: SystemParamterModifyEnum, v0.1 2018年11月15日 10:24 PM wangpeng17355 Exp $
 */
import com.alibaba.common.lang.StringUtil;

public enum SystemParamterModifyEnum {
    INVISIBLE("0", "不可见"),
    VISIBLE_NOT_MODIFIED("1", "可见不能改"),
    VISIBLE_AND_MODIFIED("2", "可见能修改");

    String code;
    String desc;

    private SystemParamterModifyEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static SystemParamterModifyEnum getByCode(String code) {
        if (StringUtil.isBlank(code)) {
            return null;
        } else {
            SystemParamterModifyEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                SystemParamterModifyEnum item = var1[var3];
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
