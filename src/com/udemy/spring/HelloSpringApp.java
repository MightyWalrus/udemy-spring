package com.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		// calls methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		// close the context
		context.close();
	}
}
