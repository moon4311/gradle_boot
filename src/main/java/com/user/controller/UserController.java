package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.model.UserVO;
import com.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/main")
	public String connectionTest() {
		UserVO user = userService.getUser();
		System.out.println("user : " + user);
		return "index";
	}
}
