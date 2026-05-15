package com.abstractdemo;

public class Test {
	public static void main(String[] args) {
		Employee ft = new FullTimeEmployee(1, "jay", 500);
		
		Employee intern = new Intern(2,"babban",100,40);
		
		
		System.out.println(ft);
		System.out.println(intern);
	}
}
