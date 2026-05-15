package com.example;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {
	org.slf4j.Logger logger = LoggerFactory.getLogger(TestApplication.class);
	
	@RequestMapping("/")
	public String index() {
		logger.trace("trace");
		logger.debug("trace");
		logger.info("trace");
		logger.warn("trace");
		logger.error("trace");
		return "welocme";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}
