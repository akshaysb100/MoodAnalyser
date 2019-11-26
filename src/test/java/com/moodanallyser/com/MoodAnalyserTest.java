package com.moodanallyser.com;

import com.moodanalyser.com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void giveMassage_WhenSad_ReturnSad() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.realMoodAnalyser("I am in Sad Mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void giveMassage_WhenHappy_ReturnHappy()  {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.realMoodAnalyser("I am in any Mood");
        Assert.assertEquals("HAPPY",mood);

    }

}
