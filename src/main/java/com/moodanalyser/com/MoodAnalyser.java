package com.moodanalyser.com;

public class MoodAnalyser {
    public static String realMoodAnalyser(String message) {

            if (message.contains(("I am in Sad  Mood"))) {
                return "SAD";
            } else {
                return "any";
            }
    }
}
