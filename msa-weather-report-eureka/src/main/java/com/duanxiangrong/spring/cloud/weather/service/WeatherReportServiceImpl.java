package com.duanxiangrong.spring.cloud.weather.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.duanxiangrong.spring.cloud.weather.vo.Forecast;
import com.duanxiangrong.spring.cloud.weather.vo.Weather;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {

	@Override
	public Weather getDataByCityId(String cityId) {
		
		Weather data = new Weather();
		data.setAqi("81");
		data.setCity("深圳");
		data.setGanmao("各项气象条件适宜");
		data.setWendu("22");
		
		List<Forecast> forecastList = new ArrayList<>();
		
		Forecast forecast = new Forecast();
		forecast.setDate("29日星期天");
		forecast.setType("多云");
		forecast.setFengxiang("无持续风");
		forecast.setHigh("高温 27度");
		forecast.setLow("低温 20度");
		forecastList.add(forecast);
		
		forecast = new Forecast();
		forecast.setDate("30日星期天");
		forecast.setType("30多云");
		forecast.setFengxiang("30无持续风");
		forecast.setHigh("30高温 27度");
		forecast.setLow("30低温 20度");
		forecastList.add(forecast);
		
		forecast = new Forecast();
		forecast.setDate("31日星期天");
		forecast.setType("31多云");
		forecast.setFengxiang("31无持续风");
		forecast.setHigh("31高温 27度");
		forecast.setLow("31低温 20度");
		forecastList.add(forecast);
		
		forecast = new Forecast();
		forecast.setDate("1日星期天");
		forecast.setType("1多云");
		forecast.setFengxiang("1无持续风");
		forecast.setHigh("1高温 27度");
		forecast.setLow("1低温 20度");
		forecastList.add(forecast);
		
		forecast = new Forecast();
		forecast.setDate("2日星期天");
		forecast.setType("2多云");
		forecast.setFengxiang("2无持续风");
		forecast.setHigh("2高温 27度");
		forecast.setLow("2低温 20度");
		forecastList.add(forecast);
 		
		data.setForecast(forecastList);
		return data;
	}

}
