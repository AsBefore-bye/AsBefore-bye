package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Configuration
public class ScheduleConfiguration {

    @Scheduled(cron = "0 9,30 9 ? * 6" )
    public void task(){
        System.out.println("我是定时任务！"+new Date());
    }
}
