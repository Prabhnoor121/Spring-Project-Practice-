package com.dailycodebuffer.Springboot.tutorial.error;

public class DepartentNotFoundException extends Exception{
    public DepartentNotFoundException() {
        super();
    }

    public DepartentNotFoundException(String message) {
        super(message);
    }

    public DepartentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartentNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DepartentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
