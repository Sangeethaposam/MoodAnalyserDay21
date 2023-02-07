package com.bridzelabz.exceptionHandling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodRefactorCodeTest {

	@Test
	public void analyseMoodRepeatTc1() {
		MoodRefactorCode mood = new MoodRefactorCode();
		String actual = mood.analyseMood();
		String expected = "sad";
		assertEquals(expected,actual);
	}
	@Test
	public void analyseMoodRepeatTc2() {
		MoodRefactorCode mood = new MoodRefactorCode("I am in happy mood");
		String actual = mood.analyseMood();
		String expected = "happy";
		assertEquals(expected,actual);
	}
}
