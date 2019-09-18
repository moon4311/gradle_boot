package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.mapper.UserMapper;
import com.user.model.UserVO;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 사용자 조회
	 * @param userVO
	 * @return
	 */
	public UserVO getUser(UserVO userVO) {
		return userMapper.getUser(userVO);
	}
	
	/**
	 * 사용자 정보 변경
	 * @param userVO
	 */
	public void upsertUser(UserVO userVO) {
		if(userVO.existedUser())
			userMapper.updateUser(userVO);
		else
			userMapper.insertUser(userVO);
	}
}
