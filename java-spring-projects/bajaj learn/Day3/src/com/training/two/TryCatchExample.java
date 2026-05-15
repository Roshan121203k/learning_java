package com.training.two;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int result = a/b;
			System.out.println("no error");
		}catch(Exception e) {
			System.out.println("error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
		System.out.println("dekhte hai");
		}
	}
}
