package com.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class UserController {

	@RequestMapping("/main")
//	public @ResponseBody String connectionTest() {
	public String connectionTest() {
		System.out.println("���� Ȯ��");
		return "Success Connect";
	}
}
