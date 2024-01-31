package com.example.bindingres.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bindingres.entity.User;
import com.example.bindingres.utils.ResponseError;

import jakarta.validation.Valid;

@Service
@RestController
public class UserService {
    @GetMapping("/test")
    public ResponseEntity<?> getNameService(){
        User user = new User();
        user.setEmail("abelr6099@gmail.com");
        user.setName("Ronald");
        return ResponseEntity.status(200).body(user);
    }

    @PostMapping("/post")
    public ResponseEntity<?> postResponseEntity(@RequestBody @Valid User request, BindingResult bindingResult) throws Exception{
        if (bindingResult.hasErrors()) {
            List<ResponseError> responseErrors = new ArrayList<>();
            for (FieldError fieldError : bindingResult.getFieldErrors()){
                ResponseError responseError = new ResponseError();
                responseError.setField(fieldError.getField());
                responseError.setMessage(fieldError.getDefaultMessage());
                responseErrors.add(responseError);
            }

            return ResponseEntity.status(500).body(responseErrors);
            
        }
        User user = new User();
        user.setEmail(request.getEmail());
        user.setName(request.getName());
        return ResponseEntity.status(200).body(user);
    }
}
