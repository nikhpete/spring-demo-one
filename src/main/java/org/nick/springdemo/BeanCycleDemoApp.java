package org.nick.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanCycleApplicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());

		context.close();
	}

}