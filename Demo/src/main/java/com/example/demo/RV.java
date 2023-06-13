package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("2")
public class RV extends College {
	void fee() {
		System.out.println("college fee is10000");
	}

}
