package com.moodanalyzer;

public class MoodAnalyzer {

	public String analyseMood(String mood) {
		try {
			if(mood == null) {
				throw new Exception("NullPointet Error");
			}
		}  catch (Exception e) {
			e.printStackTrace();
			return "happy";
		}
			return mood;	
		
	}
}

  