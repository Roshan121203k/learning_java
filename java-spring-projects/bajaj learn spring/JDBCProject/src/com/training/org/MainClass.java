package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.StudentJDBCTemplate;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentJDBCTemplate obj = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		obj.create("ahel", 1);
	}
}
