package com.duanxiangrong.spring.cloud.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duanxiangrong.spring.cloud.weather.service.CityDataService;
import com.duanxiangrong.spring.cloud.weather.vo.City;

@RestController
@RequestMapping("/cities")
public class CityController {
	
	@Autowired
	private CityDataService cityDaraService;
	
	@GetMapping
	public List<City> listCity() throws Exception {
		return cityDaraService.listCity();
	}
	
}
