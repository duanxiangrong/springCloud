package com.duanxiangrong.spring.cloud.weather.job;

import java.util.ArrayList;
import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.duanxiangrong.spring.cloud.weather.service.CityClient;
import com.duanxiangrong.spring.cloud.weather.service.WeatherDataCollectionService;
import com.duanxiangrong.spring.cloud.weather.vo.City;

public class WeatherDataSyncJob extends QuartzJobBean {
	
	private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
	
	@Autowired
	private WeatherDataCollectionService weatherDataCollectionService;
	
	@Autowired
	private CityClient cityClient;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		logger.info("Start 天气数据同步任务");
		//初始化城市ID
		List<City> cityList = null;
		try {
//			cityList = new ArrayList<>();
//			City city = new City();
//			city.setCityId("101280601");
//			cityList.add(city);
			cityList = cityClient.listCity();
		} catch (Exception e) {
			logger.error("获取城市信息异常！", e);
			throw new RuntimeException("获取城市信息异常！", e);
		} 
		
		for(City city : cityList) {
			String cityId = city.getCityId();
			logger.info("天气任务数据同步中，cityId=" + cityId);
			
			//根据城市ID同步天气数据
			weatherDataCollectionService .syncDataByCityId(cityId);
		}
		logger.info("End 天气数据同步任务");
	}

}
