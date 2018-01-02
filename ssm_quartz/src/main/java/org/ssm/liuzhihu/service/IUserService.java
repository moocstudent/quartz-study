package org.ssm.liuzhihu.service;

import org.ssm.liuzhihu.entity.User;

public interface IUserService {

	public User getUserById(int id);
	
	public User getUser(User u);
}

