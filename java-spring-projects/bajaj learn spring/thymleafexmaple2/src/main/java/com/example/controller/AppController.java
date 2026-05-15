package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@RequestMapping("/")
	public String demoMethod() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginMethod(Model model) {
		model.addAttribute("name", "Farhan");
		model.addAttribute("message","welcome ! welcome !");
		return "login";
	}
	
}
