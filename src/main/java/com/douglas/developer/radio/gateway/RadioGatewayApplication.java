package com.douglas.developer.radio.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RadioGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadioGatewayApplication.class, args);
	}

}
