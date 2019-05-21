package com.zhihua.demo.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/5/16
 */
@Component
public class SchedulerTask {
    private int count=0;

    @Scheduled(cron = "*/5 * * * * ?")
    protected void process(){
        System.out.println("this is scheduler task "+ (count++));
    }
}