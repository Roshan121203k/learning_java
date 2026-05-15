package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("applicationCntext.xml");
//		BeanFactory factory =  new XmlBeanFactory(resource);
//		Student stud =  (Student)factory.getBean("studentBean");
//		System.out.println(stud);
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Student stud =  (Student)context.getBean("studentbean");
//		System.out.println(stud);
//		Teacher demo =  (Teacher)context.getBean("teacherbean");
//		System.out.println(demo);
//		Teacher demo1 =  (Teacher)context.getBean("teacherbean");
//		System.out.println(demo1);
//		System.out.println(demo == demo1);
		Employee temp = (Employee)context.getBean("employeebean");
		A temp1 = (A)context.getBean("objA");
		temp1.display();
	}
}
