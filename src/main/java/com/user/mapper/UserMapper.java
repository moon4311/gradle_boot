package com.user.mapper;

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

	public UserVO getUser();
}
