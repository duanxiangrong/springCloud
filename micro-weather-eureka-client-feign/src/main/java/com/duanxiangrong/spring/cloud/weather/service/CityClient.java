package com.duanxiangrong.spring.cloud.weather.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("msa-weather-city-eurake")
public interface CityClient {
	
	@GetMapping("/cities")
	String listCity();

}
