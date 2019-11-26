package com.exception.com;

public class MoodAnalysisException extends Exception {

    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY, NO_SUCH_FIELD, NO_SUCH_METHOD, NO_SUCH_CLASS,
    }

    public ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public MoodAnalysisException(ExceptionType type, Throwable cause) {
        super(cause);
        this.type = type;
    }

    public MoodAnalysisException(ExceptionType type, String message, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}