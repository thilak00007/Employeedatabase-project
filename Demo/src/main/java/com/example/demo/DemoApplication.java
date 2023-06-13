package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("First Application");
		Student s1= context.getBean(Student.class);
		s1.display();
		Student s2= context.getBean(Student.class);
		s2.display();
	}

}
