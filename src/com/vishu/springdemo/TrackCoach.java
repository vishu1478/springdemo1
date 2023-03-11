package com.vishu.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "cool:"+fortuneService.getFortune();
		
	}
	//init-method
	
	public void doStartUpStuff() {
		System.out.println("Startup Stuff");
	}
	
	//destroy-method
	public void doCleanUpStuff() {
		System.out.println("Cleanup Stuff");
	}

}










