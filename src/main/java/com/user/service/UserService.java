package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.UserVO;
import com.user.service.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private static UserDao userDao;
	
	public UserVO getUser() {
		System.out.println(userDao);
		return userDao.getUser();
	}
}
