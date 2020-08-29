package org.nick.springdemo;

import org.nick.springdemo.service.FortuneService;

public class BaseballCoach implements Coach{

	private FortuneService fs;

	public BaseballCoach(FortuneService fs) {
		this.fs = fs;
	}

	public String getDailyWorkout(){
		System.out.println(fs.getFortune());
		return "Spend 30 minute batting practise";
	}

}
