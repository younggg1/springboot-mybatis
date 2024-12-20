package com.jd.springboot02.exception;

public class BaseException extends RuntimeException{
    public BaseException(String message) {
        super(message);
    }
}
