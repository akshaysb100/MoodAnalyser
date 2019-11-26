package com.moodanalyser.com;

public class MoodAnalyser {
    public static String realMoodAnalyser(String message) {

            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
    }
}
