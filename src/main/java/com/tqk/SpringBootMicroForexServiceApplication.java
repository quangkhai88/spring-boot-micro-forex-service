package com.tqk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableEurekaClient
@RibbonClient(name = "forex", configuration = ForexConfiguration.class)
public class SpringBootMicroForexServiceApplication {

	public static void main(String[] args) {
		
		System.out.println("test");
		
		SpringApplication.run(SpringBootMicroForexServiceApplication.class, args);
		
	}
}
