package com.training.one;

public class StaticBlockExample {
	static int num;
	static {
		num = 100;
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}
}
