package com.bridzelabz.exceptionHandling;

public class MoodRefactorCode {
    public String message;
    
	public MoodRefactorCode() {
		message = "i am in sad mood";
	}
	public MoodRefactorCode(String message) {
		this.message = message;
	}
	public String analyseMood() {
		if(message.contains("i am in sad mood"))
		{
			return "sad";
		}else {
			return "happy";
		}
	}
}
