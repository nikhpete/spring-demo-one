package org.nick.springdemo;

import org.nick.springdemo.model.Coach;
import org.nick.springdemo.model.TrackCoach;

public class MyApp {

	public static void main(String[] args) {
		Coach bbc = new TrackCoach();
		System.out.println(bbc.getDailyWorkout());
	}

}
