package com.moodanallyser.com;

import com.exception.com.MoodAnalysisException;
import com.moodanalyser.com.MoodAnalyser;
import com.moodanalyser.com.MoodAnalyserFactory;
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

        MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
        try{

        }catch (NullPointerException e){
            Assert.assertEquals("Enter proper Mood",moodAnalyser.realMoodAnalyser());
        }
    }

    @Test
    public void giveMessage_WhenTwoObjectEqual_ReturnObject() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        MoodAnalyser moodAnalyserFactory = MoodAnalyserFactory.createMoodAnalyser();
        Assert.assertEquals(true,moodAnalyser.equals(moodAnalyserFactory));
    }

    @Test
    public void giveMessage_WhenTwoObjectEqual_ReturnClassNotFound() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        MoodAnalyser moodAnalyserFactory = null;
        try {
            moodAnalyserFactory = MoodAnalyserFactory.createMoodAnalyser();
            Assert.assertEquals(true,moodAnalyser.equals(moodAnalyserFactory));
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,e.type);
        }
    }

    @Test
    public void giveMessage_WhenTwoObjectEqual_ReturnMethodNotFound() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        MoodAnalyser moodAnalyserFactory = null;
        try {
            moodAnalyserFactory = MoodAnalyserFactory.createMoodAnalyser();
            Assert.assertEquals(true,moodAnalyser.equals(moodAnalyserFactory));
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,e.type);
        }
    }


    @Test
    public void giveMessage_WhenTwoObjectEqual_UsingParameter_ReturnObject() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser("equal object");
        MoodAnalyser moodAnalyserFactory = MoodAnalyserFactory.createMoodAnalyser("equal object");
        Assert.assertEquals(true,moodAnalyser.equals(moodAnalyserFactory));
    }
}
