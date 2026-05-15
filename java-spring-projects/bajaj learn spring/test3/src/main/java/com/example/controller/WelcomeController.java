package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;

import ch.qos.logback.core.model.Model;

@Controller
public class WelcomeController {
	
//	@RequestMapping("/")
//	public String getfirtst() {
//		return "welcome";
//	}
	
	@RequestMapping("/")
	public String getssecond() {
		return "login";
	}
	
	@RequestMapping("/save")
	public ModelAndView getshow(@ModelAttribute User user) {
		ModelAndView obj = new ModelAndView();
		obj.setViewName("dashboard");
		obj.addObject(user);
		return obj;
	}
	
}
