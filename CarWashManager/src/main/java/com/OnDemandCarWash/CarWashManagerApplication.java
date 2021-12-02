package com.OnDemandCarWash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class CarWashManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarWashManagerApplication.class, args);
	}
	

}
