package com.moodanallyser.com;

import com.moodanalyser.com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void giveMassage_WhenSad_ReturnSad() {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        Assert.assertEquals("SAD",moodAnalyser.realMoodAnalyser());
    }

}
