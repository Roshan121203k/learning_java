package com.training.org;

public class A {
	B b;
	public A() {
		System.out.println("default constructor");
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	void print() {
		System.out.println("hello a");
	}
	
	void display() {
		print();
		b.print();
	}
}
