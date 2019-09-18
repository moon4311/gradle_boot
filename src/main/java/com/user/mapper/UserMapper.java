package com.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.user.model.UserVO;

/**
 * 사용자
 *
 * @author Kim Jae Moon
 * @since 2019. 9. 06.
 */

@Mapper
@Repository
public interface UserMapper {

	public UserVO getUser(UserVO userVO);
	public List<UserVO> getUserList(UserVO userVO);
	public void updateUser(UserVO userVO);
	public void insertUser(UserVO userVO);
}
