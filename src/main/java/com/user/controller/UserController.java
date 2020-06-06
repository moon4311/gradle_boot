package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.model.Mbr;
import com.cms.service.MbrService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	MbrService userService;

	@RequestMapping("/login")
	public @ResponseBody Object login(@RequestBody Mbr param) {
		Mbr mbr = userService.getLogin(param);
		return mbr;
	}
	
	@RequestMapping("/loginChk")
	public @ResponseBody Object loginChk() {
		Mbr mbr = userService.getUser(null);
		return mbr;
	}

}
