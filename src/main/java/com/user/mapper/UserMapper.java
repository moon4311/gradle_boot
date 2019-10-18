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
public interface UserMapper extends BasicMapper{

	
	/** 목록 조회 */
	public List<UserVO> selectList(UserVO userVO);
	
	/** 단건 조회 */
	public UserVO selectOne(UserVO userVO);

	/** 입력 */
	public void insert(UserVO userVO);

	/** 수정, 삭제 */
	public void update(UserVO userVO);
	
	
}
