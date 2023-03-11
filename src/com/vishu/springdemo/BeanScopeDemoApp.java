package com.vishu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach= context.getBean("myCoach", Coach.class);
		Coach alphaCoach= context.getBean("myCoach", Coach.class);
		boolean result=(theCoach==alphaCoach);
		System.out.println("are both objects same: "+result);
		System.out.println("Loaction of theCoach: "+theCoach);
		System.out.println("Loaction of alphaCoach: "+alphaCoach);

	}

}
