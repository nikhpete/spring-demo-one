package org.nick.springdemo;

public class MyApp {

	public static void main(String[] args) {
		Coach bbc = new TrackCoach(null);
		System.out.println(bbc.getDailyWorkout());
	}

}
