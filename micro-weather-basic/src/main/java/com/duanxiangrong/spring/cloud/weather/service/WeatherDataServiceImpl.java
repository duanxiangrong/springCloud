package com.duanxiangrong.spring.cloud.weather.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.duanxiangrong.spring.cloud.weather.vo.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {
	
	@Autowired
	private RestTemplate restTemplate;
	private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

	@Override
	public WeatherResponse getDataByCityId(String cityId) {
		String uri = WEATHER_API + "?citykey" + cityId;
		// TODO Auto-generated method stub
		return this.doGetWeatherData(uri);
	}

	@Override
	public WeatherResponse getDataByCityName(String cityName) {
		String uri = WEATHER_API + "?city" + cityName;
		// TODO Auto-generated method stub
		return this.doGetWeatherData(uri);
	}
	
	private WeatherResponse doGetWeatherData(String uri) {
		ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
		String strBody = null;
		if(response.getStatusCodeValue() == 200) {
			strBody = response.getBody();
		}
		ObjectMapper mapper = new ObjectMapper();
		WeatherResponse weather = null;
		try {
			weather = mapper.readValue(strBody, WeatherResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
