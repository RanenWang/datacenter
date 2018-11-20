/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 调度任务
 * @author wangpeng17355
 * @version $Id: ScheduledService, v0.1 2018年11月17日 3:04 PM wangpeng17355 Exp $
 */
@Component
public class ScheduledService {
    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled(){
        // TODO: 2018/11/17 检查数据库连接状态
        System.out.println("调度任务正在执行");

        //log.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }
//    @Scheduled(fixedRate = 5000)
//    public void scheduled1() {
//        System.out.println("=====>>>>>使用fixedRate{}"+ System.currentTimeMillis());
//      //  log.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
//    }
//    @Scheduled(fixedDelay = 5000)
//    public void scheduled2() {
//        System.out.println("=====>>>>>fixedDelay{}"+System.currentTimeMillis());
//      //  log.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
//    }
}