package com.training.one;

public class StaticVariableExample {
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		Player p1 = new Player("Rohit");
		Player p2 = new Player("Virat");
		
		System.out.println(p1.league);
		System.out.println(p2.league);
	}
	
}
