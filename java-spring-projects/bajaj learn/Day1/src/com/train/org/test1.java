package com.train.org;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		int ch = 0;
		Scanner sc= new Scanner(System.in);
		
		
		do {
			System.out.println("1. search 2.replace 3. print specific 4 display palindrome 5 display in ascending 6. add new 7 capital 8. min 9 max");
			ch = sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("enter name");
				Loops.search(sc.next());
				break;
			}
			case 2:{
				System.out.println("enter name to search and replace one also");
				Loops.changename(sc.next(), sc.next());
				break;
			}
			case 3:{
				System.out.println("enter specific character");
				Loops.printSpecific(sc.next().charAt(0));
				break;
			}
			case 4:{
				Loops.findPalindrome();
				break;
			}case 5:{
				Loops.displayInAscending();
				break;
			}
			case 6:{
				System.out.println("enter name");
				Loops.addNew(sc.next());
			}
			case 7:{
				Loops.doSomething();
				break;
			}case 8:{
				Loops.findMinLen();
				break;
			}
			case 9:{
				
				Loops.findMaxLen();
			}
			default:{
				ch = -1;
			}
			}
		}while(ch!= -1);
		
		
	}
}
