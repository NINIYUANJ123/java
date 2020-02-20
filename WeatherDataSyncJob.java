package com.demo.wechatweather.job;

import com.demo.wechatweather.VO.City;
import com.demo.wechatweather.service.CityDataService;
import com.demo.wechatweather.service.WeatherDataService;
import com.demo.wechatweather.service.WeatherDataServiceImpl;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

public class WeatherDataSyncJob extends QuartzJobBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

    @Autowired
    private CityDataService cityDataService;

    @Autowired
    private WeatherDataService weatherDataService;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LOGGER.info("Weather Data Sync Job");
        //获取城市ID列表
        List<City> cityList = null;

        try {
            cityList = cityDataService.listCity();
        }catch (Exception e){
            LOGGER.info("Exception! " + e);
        }

        for (City city : cityList) {
            String cityId = city.getCityName();
            LOGGER.info("Weather Date Sync Job,cityId:" + cityId);

            weatherDataService.syncDateByCityId(cityId);
        }

        LOGGER.info("Weather Date Sync Job,End!");
    }
}
