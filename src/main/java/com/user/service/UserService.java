package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.mapper.UserMapper;
import com.user.model.UserVO;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public UserVO getUser() {
		return userMapper.getUser();
	}
}
