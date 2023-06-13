package com.example.web_frontend;

import org.springframework.web.bind.annotation.RequestMapping;


public class WebController {
	@RequestMapping("/home")
	String apiHome() {
		return "home.jsp";
	}
	
	@RequestMapping("/index")
	String apiMain() {
		return "main.jsp";
	}
	

}
