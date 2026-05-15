package com.training.generics;

public class Base {
	static <T> void print(T data) {
		System.out.println(data);
	}
public static void main(String[] args) {
			print("jaiho");
			print("jai");
			print(343);
	}
}
