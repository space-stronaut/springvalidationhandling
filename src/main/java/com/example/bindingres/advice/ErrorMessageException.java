package com.example.bindingres.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.bindingres.utils.ExceptionResponse;

@ControllerAdvice
public class ErrorMessageException {
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<?> httpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException exception){
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setError(500);
        exceptionResponse.setException(HttpRequestMethodNotSupportedException.class.toString());
        exceptionResponse.setMessage(exception.getMessage());
        return ResponseEntity.status(500).body(exceptionResponse);
    }
}
