package com.bridzelabz.exceptionHandling;

public class UserProvideInvalidMoodUc2 {
	public String analyseMoodNull(String message)  {
		try {
			if(message.contains("happy"))
			{
				return "happy";
			}
			else {
				return "sad";
			}
		}catch(NullPointerException e) {
			    return "happy";
		}
	}
}
