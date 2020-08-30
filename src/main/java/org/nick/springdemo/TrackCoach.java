package org.nick.springdemo;

import org.nick.springdemo.service.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fs;

	public TrackCoach(FortuneService fs) {
		System.out.println("New Instance created");
		this.fs = fs;
	}

	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "Run a had 5k";
	}

}
