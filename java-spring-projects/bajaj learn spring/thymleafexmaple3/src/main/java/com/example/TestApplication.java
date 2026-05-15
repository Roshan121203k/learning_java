package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {
	
	
	public static void main(String[] args) {
		System.out.println("before application starts");
		SpringApplication.run(TestApplication.class, args);
		System.out.println("after application starts");
	}

	


}
