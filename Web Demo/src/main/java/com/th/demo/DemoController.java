package com.th.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
// localhost:9091
@Controller
public class DemoController {
//	
	@RequestMapping("/home")
	String apiHome() {
		return "home.jsp";
	}
	
	@RequestMapping("/index")
	String apiMain(HttpSession h, String player) {
		h.setAttribute("value", player);
		return "main.jsp";
	}
	
	
	
	
	
	
//	/localhost:9091/demo
//	@RequestMapping("/demo")
//	@ResponseBody
//	String display() {
//		System.out.println("Hello Web");
//		System.out.println("My First Spring web");
//		return "<h1>Hi this is Thilak</h1>";
//	}		
//	@RequestMapping("/demo1")
//	@ResponseBody
//		String display1(String name) {
//			System.out.println("Hello Chrome");
//			System.out.println("My First Spring web in Chrome");
//			return name+"";
//	}

}
