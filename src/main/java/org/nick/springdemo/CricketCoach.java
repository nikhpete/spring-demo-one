package org.nick.springdemo;

import org.nick.springdemo.service.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fs; 
	private String emailAddress;
	private String team;

	public void setFs(FortuneService fs) {
		System.out.println("Inside fs setter method");
		this.fs = fs;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside emailAddress setter method");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("Inside team setter method");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Inside Cricket coach no args constructor");
	}

	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		System.out.println(emailAddress);
		System.out.println(team);
		return "Practise fast bowling for 15 minutes";
	}

}
