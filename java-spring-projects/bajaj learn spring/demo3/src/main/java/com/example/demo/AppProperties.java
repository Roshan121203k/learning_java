package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
@ConfigurationProperties(prefix="app")
@Validated
@RestController
public class AppProperties {
	@Email
	private String email;
	
	@Min(1000)
	@Max(1000)
	private int timeout;
	
	
	@GetMapping("/detials")
	public String getDetails() {
		return email+ " " + timeout;
	}
}
