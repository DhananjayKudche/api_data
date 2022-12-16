package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApidataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidataApplication.class, args);
		System.out.println("success");

	}

}
