package com.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/")
	public String connectionTest() {
		System.out.println("���� Ȯ��");
		return "Success Connect";
	}
}
