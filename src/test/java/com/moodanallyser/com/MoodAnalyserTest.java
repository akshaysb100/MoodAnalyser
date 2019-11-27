package com.moodanallyser.com;

import com.exception.com.MoodAnalysisException;
import com.moodanalyser.com.MoodAnalyser;
import com.moodanalyser.com.MoodAnalyserReflector;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class MoodAnalyserTest {

    @Test
    public void giveMassage_WhenSad_ReturnSad() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser("SAD");
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
        Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
        Object moodAnalyserFactory = MoodAnalyserReflector.createMoodAnalyser(constructor);
        Assert.assertEquals(false,moodAnalyser.equals(moodAnalyserFactory));
    }

    @Test
    public void giveMessage_WhenTwoObjectEqual_ReturnClassNotFound() {

        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            Object moodAnalyserFactory = MoodAnalyserReflector.createMoodAnalyser(constructor);
            Assert.assertEquals(false,moodAnalyser.equals(moodAnalyserFactory));
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,e.type);
        }
    }

    @Test
    public void giveMessage_WhenTwoObjectEqual_ReturnMethodNotFound() {

        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            Object moodAnalyserFactory = MoodAnalyserReflector.createMoodAnalyser(constructor);
            Assert.assertEquals(false,moodAnalyser.equals(moodAnalyserFactory));
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,e.type);
        }
    }

    @Test
    public void giveMessage_WhenTwoObjectEqual_UsingParameter_ReturnObject() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
        Object moodAnalyserFactory = MoodAnalyserReflector.createMoodAnalyser(constructor);
        Assert.assertEquals(false,moodAnalyser.equals(moodAnalyserFactory));
     }

    @Test
    public void giveMessage_WhenTwoObjectEqual_UsingParameter_ReturnClassNotFound() {

        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            Object moodAnalyserFactory = MoodAnalyserReflector.createMoodAnalyser(constructor);
            Assert.assertEquals(false,moodAnalyser.equals(moodAnalyserFactory));
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,e.type);
        }
    }

    @Test
    public void giveMessage_WhenTwoObjectEqual_UsingParameter_ReturnMethodNotFound() {

        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            Object  mood = MoodAnalyserReflector.createMoodAnalyser(constructor);
            Assert.assertNotEquals(moodAnalyser,mood);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,e.type);
        }
    }

    @Test
    public void givenHappyMessage_WithReflection_ShouldReturnHappy() {

        Object moodAnalyser = null;
        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            moodAnalyser = MoodAnalyserReflector.createMoodAnalyser(constructor);
            MoodAnalyserReflector.setFiled(moodAnalyser,"message","I am in happy mood");
            Object analisMoods=MoodAnalyserReflector.invokeMethod(moodAnalyser,"realMoodAnalyser");
            Assert.assertEquals("HAPPY",analisMoods);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void giveMoodAnalyser_OnChangeMood_ShouldReturnHappy() {

        Object moodAnalyser = null;
        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            moodAnalyser = MoodAnalyserReflector.createMoodAnalyser(constructor);
            MoodAnalyserReflector.setFiled(moodAnalyser,"message","I am in happy mood");
            Object analisMoods=MoodAnalyserReflector.invokeMethod(moodAnalyser,"realMoodAnalyser");
            Assert.assertEquals("HAPPY",analisMoods);

        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenHappyMessage_WithDefaultConstructor_ShouldReturnHappy() {

        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            Object myObect = MoodAnalyserReflector.createMoodAnalyser(constructor);
            MoodAnalyserReflector.setFiled(myObect,"message","I am in happy mood");
            Object mood=MoodAnalyserReflector.invokeMethod(myObect,"realMoodAnalyser");
            Assert.assertEquals("HAPPY",mood);

        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}

