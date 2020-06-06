package com.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 매퍼 인터페이스
 *
 * @author Kim Jae Moon
 * @since 2019. 10. 18.
 */

@Mapper
@Repository
public interface BasicMapper {

	/** 목록조회 */
	public List<Object> selectList(Object object);
	
	/** 단건조회 */
	public Object selectOne(Object Object);
	
	/** 입력 */
	public boolean insert(Object Object);
	
	/** 수정, 삭제 */
	public boolean update(Object Object);
	
}
