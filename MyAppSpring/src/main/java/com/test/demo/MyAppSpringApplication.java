package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppSpringApplication.class, args);
		System.out.println("Hello world");
		System.out.println("Modified statement for git commit check");
	}

}
