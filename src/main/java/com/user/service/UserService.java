package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.mapper.UserMapper;
import com.user.model.UserVO;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	private UserVO emptyVo = new UserVO();
	/**
	 * 사용자 조회
	 * @param userVO
	 * @return
	 */
	public UserVO getUser(UserVO userVO) {
		return userMapper.selectOne(userVO);
	}
	
	/**
	 * 사용자 조회
	 */
	public List<UserVO> getUserList(UserVO userVO) {
		if(userVO == null)
			userVO = emptyVo;
			
		return userMapper.selectList(userVO);
	}
	
	/**
	 * 사용자 정보 변경
	 * @param userVO
	 */
	public void upsertUser(UserVO userVO) {
		if(userVO.existed())
			userMapper.update(userVO);
		else
			userMapper.insert(userVO);
	}
}
