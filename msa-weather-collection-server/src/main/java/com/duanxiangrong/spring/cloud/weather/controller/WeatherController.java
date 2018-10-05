package com.duanxiangrong.spring.cloud.weather.controller;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.duanxiangrong.spring.cloud.weather.job.WeatherDataSyncJob;
import com.duanxiangrong.spring.cloud.weather.service.WeatherDataService;
import com.duanxiangrong.spring.cloud.weather.vo.WeatherResponse;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	@Autowired
	private WeatherDataService weatherDataService;
	
	//日志输出
	//private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
	
	/*
	 * 根据城市ID来查询天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	@GetMapping("/cityId/{cityId}")
	public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId) {
		return weatherDataService.getDataByCityId(cityId);
	}
	
	/*
	 * 根据城市名称来查询天气数据
	 * 
	 * @param cityName
	 * @return 
	 */
	@GetMapping("/cityName/{cityName}")
	public WeatherResponse getReportByCityName(@PathVariable("cityName") String cityName) {
		return weatherDataService.getDataByCityName(cityName);
	}
}
