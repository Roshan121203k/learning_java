package com.train.org;

import java.util.Scanner;

public class exeercise {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
//		 
//		 int n1 = sc.nextInt();
//		 int n2 = sc.nextInt();
//		 int n3 = sc.nextInt();
//		 int n4 = sc.nextInt();
//		 
////		number.to
//			 int n1=Integer.parseInt(number.charAt(0)+"");
//			 int n2=Integer.parseInt(number.charAt(1)+"");
//			 int n3=Integer.parseInt(number.charAt(2)+"");
//			 int n4=Integer.parseInt(number.charAt(3)+"");
//			 System.out.println("" + (n1*1000) +(n2*100)+(n3*10)+n4 + " ");
////			 int inLine = Integer.parseInt(sc.findInLine("\\d{1,4}"));
//			 System.out.println(n1+n2+n3+n4);
//		 
//		 int[] arr = new int[4];
//
//		 int n1 = sc.nextInt();
//		 int n2 = sc.nextInt();
//		 int n3 = sc.nextInt();
//		 int n4 = sc.nextInt();
//		 
//		 System.out.println("biggest number is");
//		 if(n1  > n2 && n1>n3 && n1>n4) {
//			 System.out.println(n1);
//		 }else if(n2>n3 && n2>n4) {
//			 System.out.println(n2);
//		 }else if(n3 > n4 ) {
//			 System.out.println(n3);
//		 }else {
//		 	 System.out.println(n4);
//		 }
		 
		 
		 
		 String month=sc.nextLine();
		 
		 switch(month.toUpperCase()) {
		 default:
		 		System.out.println("Fuck off");
		 		break;
		 	case "JANUARY":
		 		System.out.println(31);
		 		break;
		 	case "FEBRUARY":
		 		System.out.println(28);
		 		break;
		 	case "MARCH":
		 		System.out.println(31);
		 		break;
		 	case "APRIL":
		 		System.out.println(30);
		 		break;
		 	case "MAY":
		 		System.out.println(31);
		 		break;
		 	case "JUNE":
		 		System.out.println(30);
		 		break;
		 	case "JULY":
		 		System.out.println(31);
		 		break;
		 	case "AUGUST":
		 		System.out.println(31);
		 		break;
		 	case "SEPTEMBER":
		 		System.out.println(30);
		 		break;
		 	case "OCTOBER":
		 		System.out.println(31);
		 		break;
		 	case "NOVEMBER":
		 		System.out.println(30);
		 		break;
		 	case "DECEMBER":
		 		System.out.println(31);
		 		break;
//		 	default:
//		 		System.out.println("Fuck off");
		 }
		 
	}
}
