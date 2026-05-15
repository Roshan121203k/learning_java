package com.training.one;

public class Example {
	public static void main(String[] args) {
		System.out.println("first Line of Execution");
		DExample obj =  new DExample();
		obj.myMessage();
	}
}
  
class DExample {
	public DExample() {
		System.out.println("constructor");
	}
	public void myMessage() {
		System.out.println("inside mymessage method");
	}
}
