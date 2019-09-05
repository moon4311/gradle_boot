package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.model.UserVO;
import com.user.service.dao.UserDao;


public class UserService {

	@Autowired
	private static UserDao userDao;
	
	
	public UserVO getUser() {
		return userDao.getUser();
	}
}
