package org.ssm.liuzhihu.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ssm.liuzhihu.entity.User;
import org.ssm.liuzhihu.service.IUserService;

public class IUserServiceTest2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService uService = (IUserService) application.getBean("userService");
		User user = uService.getUserById(1);
		System.out.println(user.getUserName());
	}
}
