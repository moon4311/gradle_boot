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
	
	@RequestMapping("/main")
//	public @ResponseBody String connectionTest() {  return 값 그대로 출력
	public String connectionTest() {		// return .jsp 로 이동
		UserVO user = userService.getUser();
		System.out.println("user : " + user.getUserId());
		return "index";
	}
}
