package com.duanxiangrong.spring.cloud.weather.vo;

import java.io.Serializable;

public class Forecast implements Serializable {
	private static final long serialVersionUID = 1L;
	private String data;
	private String hight;
	private String fengxiang;
	private String low;
	private String fengli;
	private String type;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHight() {
		return hight;
	}
	public void setHight(String hight) {
		this.hight = hight;
	}
	public String getFengxiang() {
		return fengxiang;
	}
	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getFengli() {
		return fengli;
	}
	public void setFengli(String fengli) {
		this.fengli = fengli;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
