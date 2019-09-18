package com.user.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.user.model.UserVO;
import com.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/")
//	public @ResponseBody String connectionTest() {  return 값 그대로 출력
	public String Goindex() {		// return .jsp 로 이동
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	} 
	
	
	@RequestMapping("/loginChk")
	public @ResponseBody Object loginChk(@RequestBody UserVO userVO){
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("userVO", userService.getUser(userVO));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject;
	} 
	
}
