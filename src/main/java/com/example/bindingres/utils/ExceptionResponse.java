package com.example.bindingres.utils;

public class ExceptionResponse {
    private Number error;
    private String exception;
    private String message;

    public Number getError(){
        return this.error;
    }

    public String getException(){
        return this.exception;
    }

    public String getMessage(){
        return this.message;
    }

    public void setError(Number error){
        this.error = error;
    }

    public void setException(String exception){
        this.exception = exception;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
