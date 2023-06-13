package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {
	@Autowired
	@Qualifier("2")
	College c;  
	
	
	
	Student(){
		System.out.println("Student Constructor");
		
	}
	public void display() {
		System.out.println("Student- class");
		c.fee();
	}
}
