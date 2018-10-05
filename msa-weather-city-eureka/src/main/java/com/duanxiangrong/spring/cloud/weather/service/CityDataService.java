package com.duanxiangrong.spring.cloud.weather.service;

import java.util.List;

import com.duanxiangrong.spring.cloud.weather.vo.City;

public interface CityDataService {
	
	/*
	 * 获取城市列表
	 * 
	 *  @return
	 *  @throws Exception
	 */
	List<City> listCity() throws Exception;

}
