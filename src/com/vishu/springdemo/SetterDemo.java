package com.vishu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCoach =context.getBean("myCricketCoach", CricketCoach.class);
		
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
	System.out.println(theCoach.getEmailAddress());
	System.out.println(theCoach.getTeamName());

	}

}
