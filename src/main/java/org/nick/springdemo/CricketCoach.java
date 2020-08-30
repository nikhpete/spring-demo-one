package org.nick.springdemo;

import org.nick.springdemo.service.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fs; 


	public void setFs(FortuneService fs) {
		System.out.println("Inside setter method");
		this.fs = fs;
	}

	public CricketCoach() {
		System.out.println("Inside Cricket coach no args constructor");
	}

	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "Practise fast bowling for 15 minutes";
	}

}
