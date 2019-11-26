package com.moodanalyser.com;

public class MoodAnalyser {

    private  String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message){
        this.message=message;
    }

    public  String realMoodAnalyser() {

        try {
            if (message.contains((null))) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
                e.printStackTrace();
                return "SAD";
        }
    }
}
