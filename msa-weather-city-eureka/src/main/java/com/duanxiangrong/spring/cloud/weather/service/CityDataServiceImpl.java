package com.duanxiangrong.spring.cloud.weather.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.duanxiangrong.spring.cloud.weather.util.XmlBuilder;
import com.duanxiangrong.spring.cloud.weather.vo.City;
import com.duanxiangrong.spring.cloud.weather.vo.CityList;

@Service
public class CityDataServiceImpl implements CityDataService {

	@Override
	public List<City> listCity() throws Exception {
		Resource resource = new ClassPathResource("citylist.xml");
		BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(),"utf-8"));
		StringBuffer buffer = new StringBuffer();
		String line = null;
		while ((line = br.readLine()) != null) {
			buffer.append(line);
		}
		br.close();
		
		CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class,buffer.toString());
		return cityList.getCityList();
	}

}
