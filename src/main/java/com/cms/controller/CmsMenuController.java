package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.model.MenuInfo;
import com.cms.service.MenuService;

@Controller
@RequestMapping("/cms/menu")
public class CmsMenuController {

	@Autowired
	MenuService menuService;

	@RequestMapping("")
//	public @ResponseBody Object getList(@RequestBody MenuVO menuVO) {
	public @ResponseBody Object getList() throws Exception{
		
		MenuInfo menuVO =new MenuInfo();
		List<MenuInfo> list = menuService.getMenuList(menuVO);
		return list;
	}
	
	@RequestMapping("/{id}")
	public @ResponseBody Object getOne(@PathVariable String id) {
		MenuInfo vo = menuService.getMenu(id);
		return vo;
	}

}
