package com.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.user.model.MenuVO;

/**
 * 메뉴
 *
 * @author Kim Jae Moon
 * @since 2019. 10. 18.
 */

@Mapper
@Repository
public interface MenuMapper extends BasicMapper{

	/** 목록조회 */
	public List<MenuVO> selectList(MenuVO menuVO);
	
	/** 단건조회 */
	public MenuVO select(MenuVO menuVO);
	
	/** 입력 */
	public boolean insert(MenuVO menuVO);
	
	/** 수정, 삭제 */
	public boolean update(MenuVO menuVO);
	
}
