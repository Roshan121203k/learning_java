package com.training.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.add 2.display 3.seach 4.delete ");
			choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:{
				System.out.println("enter id,name,salary");
				al.add(new Employee(sc.nextInt(),sc.next(),sc.nextDouble()));
				System.out.println("New Employee Added");
				break;
			}
			case 2:{
				al.stream().forEach((t)->System.out.println(t));
				break;
			}
			case 3:{
				System.out.println("enter name to search");
				String temp = sc.next();
				al.stream().filter((t)->t.getName().equals(temp)).forEach((t)->System.out.println(t));
				break;
			}
			case 4:{
				System.out.println("enter name");
				String temp  = sc.next();
//				for (int i=0;i<al.size();i++) {
//					if(al.get(i).getName().equals(temp)) {
//						al.remove(i);
//						break;
//					};
//				}
				System.out.println("deleted");
				
				
				Iterator<Employee> itr = al.iterator();
				while(itr.hasNext()) {
					if(itr.next().getName().equals(temp)) {
						itr.remove();
						break;
					}
				}
				
				
				
				break;
			}
			
			case 5:{
				al.stream().filter((t)->t.getBasicSalary() < 30000).forEach((t)->t.setBasicSalary(t.getBasicSalary()*1.10));
				break;
			}
			
			case 6:{
				al.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach((t)->System.out.println(t));
				break;
			}
			case 7:{
				double temp = al.stream().mapToDouble(t->t.getBasicSalary()).average().orElseThrow();
				System.out.println("avg is " + temp);
				al.stream().filter((t)->t.getBasicSalary() > temp).forEach((t)->System.out.println(t));;
				break;
			}
			
			case 8:{
				double temp = al.stream().mapToDouble((t)->t.getBasicSalary()).max().orElseThrow();
				al.stream().filter((t)->t.getBasicSalary() == temp).forEach((t)->System.out.println(t));
				break;
			}
			
			case 9:{
				System.out.println("The sum is "+ al.stream().mapToDouble((t)->t.getBasicSalary()).sum());
				break;
			}
			}
			
		}while(choice != -1); 
	}
}
