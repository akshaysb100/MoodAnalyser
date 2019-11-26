package com.moodanalyser.com;

public class MoodAnalyser {

    private  String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message){
        this.message=message;
    }

    public  String realMoodAnalyser() {

            if (message.contains(("I am in sad mood"))) {
                return "SAD";
            } else {
                return "HAPPY";
            }
    }
}
