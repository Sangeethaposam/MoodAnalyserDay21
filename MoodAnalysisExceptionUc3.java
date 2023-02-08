package com.bridzelabz.exceptionHandling;

import com.bridzelabz.exceptionHandling.MoodAnalysisException.enumType;

public class MoodAnalysisExceptionUc3 {
	
	public String analyseMood(String message) throws MoodAnalysisException{
		
        	  if(message == null) {
        		 throw new MoodAnalysisException("NULL_MOOD",MoodAnalysisException.enumType.NULL_MOOD);
        	 }
        	
        	  else if(message.contains("happy"))
			{
				return "happy";
			}
			else if(message.contains("sad")){
				return "sad";
			}
			else {
			  throw new MoodAnalysisException("EMPTY_MOOD",MoodAnalysisException.enumType.EMPTY_MOOD);
			}
          }
	public String analyseMood1(String message) throws MoodAnalysisException{
		
  	  if(message == null) {
  		 throw new MoodAnalysisException("NULL_MOOD",MoodAnalysisException.enumType.NULL_MOOD);
  	 }
  	
  	  else if(message.contains("happy"))
		{
			return "happy";
		}
		else if(message.contains("sad")){
			return "sad";
		}
		else {
		  throw new MoodAnalysisException("EMPTY_MOOD",MoodAnalysisException.enumType.EMPTY_MOOD);
		}
    }
          
	
}

