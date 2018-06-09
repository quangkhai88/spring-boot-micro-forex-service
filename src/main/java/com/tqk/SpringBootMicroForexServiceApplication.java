package com.tqk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootMicroForexServiceApplication {

	public static void main(String[] args) {
		
		System.out.println("test");
		
		SpringApplication.run(SpringBootMicroForexServiceApplication.class, args);
		
	}
}
