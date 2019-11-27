package com.moodanalyser.com;

import com.exception.com.MoodAnalysisException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserReflector {

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

    public static MoodAnalyser createMoodAnalyser(String message) throws MoodAnalysisException {

        try {
            Class<?> moodClass = Class.forName("com.moodanalyser.com.MoodAnalyser");
            Constructor<?> moodConstructor = null;
            moodConstructor = moodClass.getConstructor(String.class);
            Object newObject = moodConstructor.newInstance(message);
            return (MoodAnalyser) newObject;
        } catch (ClassNotFoundException e) {
            throw  new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,"Class not found");
        }catch (NoSuchMethodException e) {
            throw  new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,"Method not found",e);

        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Object invokeMethod(Object objectClass,String methodName) throws MoodAnalysisException {

        try {

              return objectClass.getClass().getMethod(methodName).invoke(objectClass);

        } catch (NoSuchMethodException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,"Method not found");
        }catch (InvocationTargetException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Method_INVATION_ISSUE,"Issue with data");
        }catch (IllegalAccessException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Method_INVATION_ISSUE,"Issue with data",e);
        }

    }

    public static void setFiled(Object moodAnalyser, String filedName, String filedValue) throws MoodAnalysisException {

        try {
                Field field = moodAnalyser.getClass().getDeclaredField(filedName);
                field.setAccessible(true);
                field.set(moodAnalyser,filedValue);
        } catch (NoSuchFieldException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_FIELD,"field not found");
        } catch (IllegalAccessException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ILLEGAL_ACCESS,"Issue with data",e);
        }

    }
}
