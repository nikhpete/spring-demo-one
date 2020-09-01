package org.nick.springdemo;

import org.nick.springdemo.model.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SettterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("myCricketCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());

		context.close();
	}

}
