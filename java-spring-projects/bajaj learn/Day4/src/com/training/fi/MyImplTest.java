package com.training.fi;

public class MyImplTest{

	public static void main(String[] args) {
		MyInterface obj = () -> System.out.println("add this to the interface");
		
		
		obj.sayHello();
	}

}
