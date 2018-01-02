package com.liuzhihu.jdbctest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * 
 * @author liuzhihu
 *
 */
public class MyJob implements Job {
	private static final Logger log = LoggerFactory.getLogger(MyJob.class);

	public void execute(JobExecutionContext context) throws JobExecutionException {
		log.info("MyJob  is start ..................");

		log.info("Hello quzrtz  " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()));

		log.info("MyJob  is end .....................");
	}

}