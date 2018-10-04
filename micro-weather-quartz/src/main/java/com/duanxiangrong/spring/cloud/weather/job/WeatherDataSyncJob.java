package com.duanxiangrong.spring.cloud.weather.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class WeatherDataSyncJob extends QuartzJobBean {
	private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
	
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		logger.info("天数数据同步任务");
	}
}
