package org.nick.springdemo;

import org.nick.springdemo.service.FortuneService;

import lombok.NoArgsConstructor;

@NoArgsConstructor
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

	//init method
	public void doMyStartupStuff() {
		System.out.println("doMyStartupStuff");
	}

	//destroy method
	public void doMyCleanupStuff() {
		System.out.println("doMyCleanupStuff");
	}

}
