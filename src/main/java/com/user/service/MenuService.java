package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.mapper.MenuMapper;
import com.user.model.MenuVO;

@Service
public class MenuService {

	@Autowired
	private MenuMapper menuMapper;
	
	private MenuVO emptyVo = new MenuVO();
	/**
	 * 단건 조회
	 * @param menuVO
	 * @return
	 */
	public MenuVO getMenu(MenuVO menuVO) {
		return menuMapper.select(menuVO);
	}
	
	/**
	 * 목록 조회
	 * @param menuVO
	 */
	public List<MenuVO> getMenuList(MenuVO menuVO) {

		if(menuVO == null) menuVO = emptyVo;
		
		return menuMapper.selectList(menuVO);
	}
	
	
	/**
	 * insert, update
	 * @param menuVO
	 */
	public boolean upsertMenu(MenuVO menuVO) {
		if(menuVO.existed())
			return menuMapper.update(menuVO);
		else
			return menuMapper.insert(menuVO);
	}
	
}
