package com.user.service.dao;

import org.apache.ibatis.annotations.Mapper;

import com.user.model.UserVO;

/**
 * »ç¿ëÀÚ
 *
 * @author Kim Jae Moon
 * @since 2019. 9. 06.
 */

@Mapper
public interface UserDao {

	public UserVO getUser();
}
