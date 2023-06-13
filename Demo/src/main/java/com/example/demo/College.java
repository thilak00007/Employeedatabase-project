package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class College {
	void fee() {
		System.out.println("college fee");
	}

}
