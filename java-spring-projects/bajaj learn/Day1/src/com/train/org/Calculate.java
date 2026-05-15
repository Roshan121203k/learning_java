package com.train.org;

import java.util.Scanner;

public class Calculate {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		
		do {
			System.out.println("1 for add 2 for sub 3 for mul 4 for div");
			ch = sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("enter numbers");
				int n = sc.nextInt();
				int m = sc.nextInt();
				Arthimmetic.add(m, n);
				break;
			}
			case 2:{
				System.out.println("enter numbers");
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(Arthimmetic.sub(m, n));
				break;
			}
			case 3:{
					Arthimmetic.mul();
					break;
			}
			case 4:{
				System.out.println(Arthimmetic.div());
				break;
		}
			}
		}while(ch!= -1);
	}
}

class Arthimmetic{
	public static void add(int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public static int sub(int n1,int n2) {
		return Math.abs(n1-n2);
	}
	
	public static void mul() {
		System.out.println("enter numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(Math.abs(n*m));
	}
	public static double div() {
		System.out.println("enter numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		return (Math.abs((double)n/(double)m));
	}
}
