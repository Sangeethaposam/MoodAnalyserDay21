package com.bridzelabz.exceptionHandling;


import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class MoodAnalyserTestUc1 {
	@Test
	public void analyseMood() {
		MoodAnalyserUc1 mood = new MoodAnalyserUc1();
		String actual = mood.analyseMood("happy");
		String expected = "happy";
		assertEquals(expected,actual);
	}
	@Test
	public void analyseMoodTc1() {
		MoodAnalyserUc1 mood = new MoodAnalyserUc1();
		String actual = mood.analyseMoodTc1("i am in sad mood");
		String expected = "sad";
		assertEquals(expected,actual);
	}
	@Test
	public void analyseMoodTc2() {
		MoodAnalyserUc1 mood = new MoodAnalyserUc1();
		String actual = mood.analyseMoodTc2("i am in any mood");
		String expected = "happy";
		assertEquals(expected,actual);
	}
	
}


