/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.model;

import com.alibaba.common.lang.enumeration.Enum;
import com.hundsun.ta.datacenter.enums.ResultStatusEnum;

/**
 * @author wangpeng17355
 * @version $Id: RequestResult, v0.1 2018年11月17日 10:48 AM wangpeng17355 Exp $
 */
public class RequestResult {

    String status;
    String data;
    String message;
    public RequestResult(){
        this.status = ResultStatusEnum.FAIL.getCode();
        this.data = "";
        this.message = "";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }


    public void setData(String date) {
        this.data = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }}