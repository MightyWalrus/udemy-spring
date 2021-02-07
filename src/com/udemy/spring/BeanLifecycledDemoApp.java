package com.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycledDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycled_applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		
		context.close();
	}

}
