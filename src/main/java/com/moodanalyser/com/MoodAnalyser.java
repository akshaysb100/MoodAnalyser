package com.moodanalyser.com;

import com.exception.com.MoodAnalysisException;

public class MoodAnalyser {

    private  String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message){
        this.message=message;
    }

    public  String realMoodAnalyser() throws MoodAnalysisException {

        try {
            if (message.contains((null))) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("happy");
        }
    }
}
