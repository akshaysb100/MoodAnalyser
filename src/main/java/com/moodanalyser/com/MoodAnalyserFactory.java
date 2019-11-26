package com.moodanalyser.com;

import com.exception.com.MoodAnalysisException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {

    public static MoodAnalyser createMoodAnalyser() throws MoodAnalysisException {

        try {
            Class<?> moodClass = Class.forName("com.moodanalyser.com.MoodAnalyser");
            Constructor<?> moodConstructor = null;
            moodConstructor = moodClass.getConstructor();
            Object newObject = moodConstructor.newInstance();
            return (MoodAnalyser) newObject;
        } catch (ClassNotFoundException e) {
            throw  new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,"Class not found");
        }catch (NoSuchMethodException e) {
            throw  new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,"Method not found");

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
