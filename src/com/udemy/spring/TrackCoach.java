package com.udemy.spring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "do 5mile run";
	}
	
	private void customInit() {
		System.out.println("TrackCoach is being created...");
	}
	
	private void customDestroy() {
		System.out.println("TrackCoach is being destroyed...");
	}

}
