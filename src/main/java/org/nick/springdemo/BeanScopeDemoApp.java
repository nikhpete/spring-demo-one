package org.nick.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		System.out.println(alphaCoach.getDailyWorkout());
		
		System.out.println(coach==alphaCoach);

		context.close();
	}

}

/* singleton scope
 * New Instance created
 * The journey is the reward
 * Run a had 5k
 * Diligence is the mother of good luck
 * Run a had 5k
 * true
 */

/* prototype scope
 * New Instance created
 * The journey is the reward
 * Run a had 5k
 * New Instance created
 * Beware of the wolf in sheep's clothing
 * Run a had 5k
 * false
 */