package com.spring.restaurantManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages=("com.spring.restaurantManagement.controller"))
@ComponentScan("com.spring.restaurantManagement")


public class RestaurantManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantManagementApplication.class, args);
	}

	
}
