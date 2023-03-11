package com.vishu.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public CricketCoach() {
		System.out.println("Cricket coach:no -arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket Coach:setter method");
		
		this.fortuneService = fortuneService;
		
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {

		return "practice bowling";
	}

}
