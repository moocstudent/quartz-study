package com.liuzhihu.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyJob implements Job {

	private static Logger log = LoggerFactory.getLogger(MyJob.class);

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDetail jobDetail = context.getJobDetail();

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		log.info("-----------------start sleep--------------------");
		log.info("date : " + sf.format(new Date()) + "-----------jobName---------" + jobDetail.getKey().getName());

		log.info("-----------------start end--------------------");

	}

}
