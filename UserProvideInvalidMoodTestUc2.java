package com.bridzelabz.exceptionHandling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserProvideInvalidMoodTestUc2 {
	@Test
	public void analyseMoodNull() {
		UserProvideInvalidMoodUc2 mood = new UserProvideInvalidMoodUc2();
		String actual = mood.analyseMoodNull(null);
		String expected = "happy";
		assertEquals(expected,actual);
	}
}
