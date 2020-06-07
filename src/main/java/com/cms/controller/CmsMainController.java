package com.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cms")
public class CmsMainController {

	@RequestMapping("/")
	public String Goindex() {		// return .jsp 로 이동
		return "cms/index";
	}


}
