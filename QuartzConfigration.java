package com.demo.wechatweather.config;


import com.demo.wechatweather.job.WeatherDataSyncJob;
import com.demo.wechatweather.service.WeatherDataService;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfigration {

    private static final int TIME = 1800; //更新频率

    //JobDetail
    @Bean
    public JobDetail weatherDataSyncJobJobDetail(){
        return JobBuilder.newJob(WeatherDataSyncJob.class).withIdentity("weatherDataSynvJob")
                .storeDurably().build();
    }
    //Trigger
    @Bean
    public Trigger weatherDataSuncTrigger(){
        SimpleScheduleBuilder ScheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(TIME).repeatForever();

        return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobJobDetail())
                .withIdentity("weatherDataSuncTrigger").withSchedule(ScheduleBuilder).build();
    }

}
