package com.example.bindingres.utils;

public class ResponseError {
    private String field;
    private String message;

    public String getField(){
        return this.field;
    }

    public String getMessage(){
        return this.message;
    }

    public void setField(String field){
        this.field = field;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
