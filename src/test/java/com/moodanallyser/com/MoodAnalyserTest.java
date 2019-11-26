package com.moodanallyser.com;

import com.exception.com.MoodAnalysisException;
import com.moodanalyser.com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void giveMassage_WhenSad_ReturnSad() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        Assert.assertEquals("SAD",moodAnalyser.realMoodAnalyser());
    }

    @Test
    public void giveMassage_WhenHappy_ReturnHappy() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
        Assert.assertEquals("HAPPY",moodAnalyser.realMoodAnalyser());
    }

    @Test
    public void giveMessage_WhenNullPointerException_ReturnHappy() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{

        }catch (NullPointerException e){
            Assert.assertEquals("happy",moodAnalyser.realMoodAnalyser());
        }
    }

    @Test
    public void giveMessage_WhenEmptyMessage_ReturnHappy() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try{

        }catch (NullPointerException e){
            Assert.assertEquals("Enter proper Mood",moodAnalyser.realMoodAnalyser());
        }
    }
}
