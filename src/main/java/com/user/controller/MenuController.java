package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.user.model.MenuVO;
import com.user.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	MenuService menuService;

	@RequestMapping("")
//	public @ResponseBody Object getList(@RequestBody MenuVO menuVO) {
	public @ResponseBody Object getList() {
		MenuVO menuVO = new MenuVO();
		System.err.println(menuVO);
		List<MenuVO> list = menuService.getMenuList(menuVO);
		System.err.println(list);
		return list;
	}
	
	@RequestMapping("/{id}")
	public @ResponseBody Object getOne(@PathVariable Integer id) {
		MenuVO vo = new MenuVO(id);
		vo = menuService.getMenu(vo);
		return vo;
	}

}
