package com.udemy.spring;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Something deep and wise...";
	}

}
