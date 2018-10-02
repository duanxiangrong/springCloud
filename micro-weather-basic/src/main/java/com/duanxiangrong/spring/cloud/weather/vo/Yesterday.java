package com.duanxiangrong.spring.cloud.weather.vo;

import java.io.Serializable;

public class Yesterday implements Serializable {
	private static final long serialVersionUID = 1L;
	private String date;
	private String hight;
	private String fx;
	private String low;
	private String fl;
	private String type;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHight() {
		return hight;
	}
	public void setHight(String hight) {
		this.hight = hight;
	}
	public String getFx() {
		return fx;
	}
	public void setFx(String fx) {
		this.fx = fx;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getFl() {
		return fl;
	}
	public void setFl(String fl) {
		this.fl = fl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
