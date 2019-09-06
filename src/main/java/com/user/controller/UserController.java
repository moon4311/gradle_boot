package com.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/main")
	public String connectionTest() {
		System.out.println("연결 확인");
		return "Success Connect";
	}
}
