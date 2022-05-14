package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("spring.xml");
		Employee e1= (Employee) cxt.getBean("emplob");
		e1.display();
		
		Employee e11= (Employee) cxt.getBean("emplob1");
		e11.display();
		
	}

}
