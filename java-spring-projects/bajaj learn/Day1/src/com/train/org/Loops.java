package com.train.org;

import java.util.Arrays;

public class Loops {
	
	static String[] list= {"RaR","Shyam","Baburao","Mastani","Khilji","ravan","BoB"};
	
	public static void printSpecific(char ch) {
		for (String str : list) {
			if(str.charAt(0) == ch) {
				System.out.println(str);
			}
		}
	}
	
	public static void search(String name) {
		for (String str : list) {
			if(str.equals(name)) {
				System.out.println("found");
			}
		}
	}
	
	public static void changename(String name1,String name2) {
		for (int i=0;i<list.length;i++) {
			if(list[i].equals(name1)) {
				list[i] = name2;
			}
		}
	}
	
	
	public static void findPalindrome() {
		for(String st:list) {
			StringBuilder stt=new StringBuilder(st);
			stt.reverse();
			if(st.equals(stt.toString())) {
				System.out.println(st+" is a palindrome");
			}
		}
	}
	
	public static void displayInAscending() {
		String[] temp=list;
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		
		
		
	}
	
	
	public static void addNew(String name) {
		String[] newArray=new String[list.length+1];
		for(int i=0;i<list.length;i++) {
			newArray[i]=list[i];
		}
		newArray[newArray.length-1]=name;
		list=newArray;
		System.out.println(Arrays.toString(list));
	}
	
	public static void doSomething() {
		for (int i=0;i<list.length;i++) {
			
			String temp = list[i];
			char temp1=Character.toUpperCase(temp.charAt(0));			
			list[i]=temp1+list[i].substring(1);
				
		}
		System.out.println(Arrays.toString(list));
	}

	
	public static void findMinLen() {
		int minLen=0;
		int tempSize=list[0].length();
		for(int i=1;i<list.length;i++){
		
			if(tempSize>list[i].length()) {
				minLen=i;
				tempSize=list[i].length();
			}
		}
		System.out.println(list[minLen]);
	}
	
	public static void findMaxLen() {
		int minLen=0;
		int tempSize=list[0].length();
		for(int i=1;i<list.length;i++){
		
			if(tempSize<list[i].length()) {
				minLen=i;
				tempSize=list[i].length();
			}
		}
		System.out.println(list[minLen]);
	}
	
}
