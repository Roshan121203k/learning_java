package com.training.generics;

public class TestGeneric {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		
		box.set("JAVA");
		System.out.println(box.get());
	}
}
