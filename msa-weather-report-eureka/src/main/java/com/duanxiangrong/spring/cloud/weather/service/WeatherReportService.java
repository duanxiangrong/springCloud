package com.duanxiangrong.spring.cloud.weather.service;

import com.duanxiangrong.spring.cloud.weather.vo.Weather;

public interface WeatherReportService {
	
	/*
	 * 根据城市ID查询天气信息
	 * 
	 * @param cityId
	 * @return 
	 */
	Weather getDataByCityId(String cityId);
}
