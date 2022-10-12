package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.*")
public class FoodizantApplication {
	static private ConfigurableApplicationContext context;
	public static void main(String[] args) {
		context = SpringApplication.run(FoodizantApplication.class, args);
	}

}
