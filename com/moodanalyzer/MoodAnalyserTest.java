package com.moodanalyzer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

	@Test
	public void testMoodAnalyser() {
		
		MoodAnalyzer mood = new MoodAnalyzer();
	
		assertEquals("HAPPY", mood.analyseMood("HAPPY"));
		assertEquals("SAD", mood.analyseMood("SAD"));
		assertEquals("NULL", mood.analyseMood("HAPPY"));
	}
}
