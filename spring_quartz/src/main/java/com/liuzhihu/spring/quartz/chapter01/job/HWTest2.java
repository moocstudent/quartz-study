package com.liuzhihu.spring.quartz.chapter01.job;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * simpleTrigger
 * 
 * @author liuzhihu
 *
 */
public class HWTest2 {

	public static void main(String[] args) {

		// 参考spring_quartz/spring_quartz2，自行完成cronTrigger的代码
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_quartz2.xml");
	}
}
