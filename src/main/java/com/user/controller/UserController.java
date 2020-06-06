package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.service.MbrService;
import com.user.model.UserVO;
import com.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	MbrService userService;

	@RequestMapping("/login")
	public @ResponseBody Object login(@RequestBody UserVO userVO) {

		UserVO user = userService.getUser(userVO);
		return user;
	}
	
	@RequestMapping("/loginChk")
	public @ResponseBody Object loginChk() {

		UserVO user = userService.getUser(null);
		return user;
	}

}
