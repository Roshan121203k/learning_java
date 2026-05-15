package com.train.org;

import java.io.IOException;

import javax.swing.JOptionPane;

public class BuffredReader {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
//		
//		int id;
//		id = Integer.parseInt(obj.readLine());
//		System.out.println("id read from console" + id);
//		System.out.println("enter name");
//		System.out.println("the name is " + obj.readLine());
//		System.out.println("enter salary");
//		System.out.println("the salary in double  is " + Double.parseDouble(obj.readLine()));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your id");
//
//		int id=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter your name");
//		String name=sc.next();
//		System.out.println("Enter your sALARY");
//		double sal=sc.nextDouble();
//		 
//		System.out.println("your id is"+id +" your name is"+ name+ "your choutusi salary is"+ sal+"your are gareeb");
		
		int id ;
		id = Integer.parseInt(JOptionPane.showInputDialog("enter id"));
		
		String name;
		name = JOptionPane.showInputDialog("enter name");
		double sal;
		sal = Double.parseDouble(JOptionPane.showInputDialog("enter sal"));
		
		JOptionPane.showMessageDialog(null, "name " + name + " id " + id + "sal " +sal);
		
		JOptionPane.showInternalMessageDialog(null, "The value are "+id+" "+sal+" "+name);
		
	}
}	
