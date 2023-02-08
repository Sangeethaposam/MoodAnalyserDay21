package com.bridzelabz.exceptionHandling;


public class MoodAnalysisException extends Exception {
	enum enumType{
		EMPTY_MOOD,NULL_MOOD
	}
	private String message;
	enumType type;
    
	public MoodAnalysisException(String message , enumType type) {
		super(message);
		//this.message = message;
		this.type = type;
	}
	
}