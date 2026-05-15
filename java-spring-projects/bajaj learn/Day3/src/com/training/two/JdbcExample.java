package com.training.two;

import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

public class JdbcExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/company","host","Roshan@234");
			
			con.close();
		}catch(Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
	}
}
