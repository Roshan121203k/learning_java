package com.training.one;

class StaticCounterExample {
	private static int counter = 0;
	private String name;
	private int age;
	
	public StaticCounterExample() {
		counter += 1;
		name = "mahi";
		age = 40;
	}
	
	
	public static void count() {
		System.out.println("Counter " + counter);
	}
}

public class TestStaticCounterExample {
		public static void main(String[] args) {
			StaticCounterExample c1 = new StaticCounterExample();
			StaticCounterExample c2 = new StaticCounterExample();
			StaticCounterExample c3 = new StaticCounterExample();
			StaticCounterExample c4 = new StaticCounterExample();
			c4.count();
		}
}
