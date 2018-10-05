package com.duanxiangrong.spring.cloud.weather.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duanxiangrong.spring.cloud.weather.vo.City;

@FeignClient("msa-weather-city-eureka")
public interface CityClient {
	@GetMapping("/cities")
	List<City> listCity() throws Exception;
}
