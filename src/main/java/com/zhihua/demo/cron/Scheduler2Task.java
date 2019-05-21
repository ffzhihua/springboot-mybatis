package com.zhihua.demo.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/5/16
 */
@Component
public class Scheduler2Task {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime(){
        System.out.println(dateFormat.format(new Date()));
    }
}