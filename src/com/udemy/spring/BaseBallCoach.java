package com.udemy.spring;

public class BaseBallCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "do 30 min batt practice";
	}
}
