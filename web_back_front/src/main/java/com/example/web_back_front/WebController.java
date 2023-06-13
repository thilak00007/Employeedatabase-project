package com.example.web_back_front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping("login")
	String loginUser() 
	{
		return "login.jsp";
	}
	@RequestMapping("validate")
	String validateUser(String email, String pass) {
		if(email.equals("admin@gmail.com")&&pass.equals("Admin@123")) {
			return "welcome.jsp";
		}
		return "error.jsp";
	}
}
