package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Validated
public class WelcomeMessage {
		@Value("${spring.application.name}")
		private String appName;
		@Value("${custom.made}")
		private String titile;
		@Value("${custom.ver}")
		private String version;
		@Autowired
		ConfigExample obj;
		@Email
		@Value("${jumbo.email}")
		private String email;
	@GetMapping("/")
	public String methodname() {
		return 
				 " <a href='http://localhost:8080/list'>buton </a>";
	}
	
	
	@GetMapping("/list")
	public String getList() {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(1,"dsfa",43.0));
		al.add(new Employee(1,"dsfa",43.0));
		al.add(new Employee(1,"dsfa",43.0));  
		al.add(new Employee(1,"dsfa",43.0));
		al.add(new Employee(1,"dsfa",43.0));	al.add(new Employee(1,"dsfa",43.0));
		String temp = "<table border='2px solid black'>";
		
		
		for (Employee i : al) {
			temp += "<tr> <td> " + i.getName() + "</td>";
			temp += " <td> " + i.getId() + "</td> ";
			temp += " <td> " + i.getSalary() + "</td> </tr>";
		}
		temp += "</table>  " + appName + "   " + titile + version;
		return temp;
	}
	
	@GetMapping("/info")
	public String method() {
		return obj.toString();
	}
	
}
