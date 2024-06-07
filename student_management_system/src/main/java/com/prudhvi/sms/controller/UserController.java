package com.prudhvi.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/example")
	public static String view() {
		
		return "example";
	}

}
