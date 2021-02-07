package com.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopedDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansscoped_applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach myOtherCoach = context.getBean("myCoach", Coach.class);
		
		boolean same = myCoach == myOtherCoach;
		System.out.println("Pointing to the same object? => " + same);
		
		context.close();
	}

}
