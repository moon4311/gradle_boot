package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.user.model.UserVO;
import com.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/loginChk")
//	@JsonFormat
//	public @ResponseBody Object loginChk(@RequestBody UserVO userVO) {
	public @ResponseBody Object loginChk() {

		UserVO user = userService.getUser(null);
		return user;
	}

}
