package com.example.applicationapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient 
public class ApplicationApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationApiGatewayApplication.class, args);
	}

}
