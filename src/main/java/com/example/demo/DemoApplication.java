package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(111);
		System.out.println(222);
		System.out.println(333);
		System.out.println("hotfix commit");
		System.out.println("master commit");
	}

}
