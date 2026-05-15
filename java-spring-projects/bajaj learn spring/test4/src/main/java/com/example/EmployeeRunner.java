package com.example;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class EmployeeRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> al = List.of(new Employee(1,"whfds"),new Employee(2,"dfasdf"));
		
		al.stream().forEach((t)->System.out.println(t));
	}
	
}
