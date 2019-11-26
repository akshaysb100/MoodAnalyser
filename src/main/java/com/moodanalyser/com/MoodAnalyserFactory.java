package com.moodanalyser.com;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {

    public static MoodAnalyser createMoodAnalyser(){

        try {
            Class<?> moodClass = Class.forName("com.moodanalyser.com.MoodAnalyser");
            Constructor<?> moodConstructor = null;
            moodConstructor = moodClass.getConstructor();
            Object newObject = moodConstructor.newInstance();
            return (MoodAnalyser) newObject;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }


}
