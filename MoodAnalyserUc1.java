package com.bridzelabz.exceptionHandling;

public class MoodAnalyserUc1{
	
	public String analyseMood(String message)  {

		if(message.contains("happy"))
		{
			return "happy";
		}
		else {
			return "sad";
		}
            
	}

	public String analyseMoodTc1(String message)  {

		if(message.contains("i am in any mood"))
		{
			return "happy";
		}
		else {
			return "sad";
		}
            
	}
	public String analyseMoodTc2(String message)  {

		if(message.contains("i am in any mood"))
		{
			return "happy";
		}
		else {
			return "sad";
		}
            
	}
	
}

