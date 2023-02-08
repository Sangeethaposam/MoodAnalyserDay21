package com.bridzelabz.exceptionHandling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalysisExceptionTestUc3 {
	@Test
	public void analyseMood() throws MoodAnalysisException {
		MoodAnalysisExceptionUc3 mood = new MoodAnalysisExceptionUc3();
		try {
		String actual = mood.analyseMood(null);
		}catch(MoodAnalysisException m) {
		assertEquals(MoodAnalysisException.enumType.NULL_MOOD,m.type);
		}
	}
	@Test
	public void analyseMood1() throws MoodAnalysisException {
		MoodAnalysisExceptionUc3 mood = new MoodAnalysisExceptionUc3();
		try {
		String actual = mood.analyseMood1("");
		}catch(MoodAnalysisException m) {
		assertEquals(MoodAnalysisException.enumType.EMPTY_MOOD,m.type);
		}
	}
}
