package com.pro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Active {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MyEmp.xml");
		mainApp m=(mainApp)context.getBean("Input");
		m.show();
	}
}
