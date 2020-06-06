package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.MenuInfoMapper;
import com.cms.model.MenuInfo;
import com.cms.model.MenuInfoExample;

@Service
public class MenuService {

	@Autowired
	private MenuInfoMapper menuInfoMapper;
	
	/**
	 * 단건 조회
	 * @param menuVO
	 * @return
	 */
	public MenuInfo getMenu(String menuId) {
		return menuInfoMapper.selectByPrimaryKey(menuId);
	}
	
	/**
	 * 목록 조회
	 * @param menuVO
	 */
	public List<MenuInfo> getMenuList(MenuInfo menuInfo) {

		MenuInfoExample example = new MenuInfoExample();
		
		
		return menuInfoMapper.selectByExample(example);
	}
	
	
	/**
	 * insert, update
	 * @param menuVO
	 */
	public int upsertMenu(MenuInfo menuInfo) {
		if(menuInfo.getMenuId()!=null || menuInfo.getMenuId().equals("") )
			return menuInfoMapper.insert(menuInfo);
		else
			return menuInfoMapper.updateByPrimaryKey(menuInfo);
	}
	
}
