/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangpeng17355
 * @version $Id: ContextUtil, v0.1 2018年11月18日 11:21 AM wangpeng17355 Exp $
 */
@Configuration
public class ContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;
    @Override public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {

        ContextUtil.applicationContext = applicationContext;

    }
    public static ApplicationContext getContext() {
        return ContextUtil.applicationContext;
    }

    public static <T> T getBean(Class<T> t) {
        return ContextUtil.applicationContext.getBean(t);
    }
}