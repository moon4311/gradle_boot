package com.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/main")
	public String connectionTest() {
		System.out.println("���� Ȯ��");
		return "Success Connect";
	}
}
