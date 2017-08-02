package com.zhiwei.service;

import com.zhiwei.dao.UserDao;
import com.zhiwei.dao.UserDaoImple;
import com.zhiwei.model.User;

public class UserService {

	public User login(User user) {
		UserDao dao = new UserDaoImple();
		return dao.login(user);
	}
	
	
}
