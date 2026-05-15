package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("applcaiton context");
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println("----> " + beanName );
		}
		
		
	}
	

}
