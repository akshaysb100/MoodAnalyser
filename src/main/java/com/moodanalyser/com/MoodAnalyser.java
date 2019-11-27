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
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"happy");
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Class not found");
        }
    }

    public boolean equals(MoodAnalyser another){
        if (this.message == another.message)
            return true;
        return false;
    }
}
