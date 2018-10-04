package com.duanxiangrong.spring.cloud.weather.service;

public interface WeatherDataCollectionService {
	/*
	 * 根据城市ID同步天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	void syncDataByCityId(String cityId);

}
