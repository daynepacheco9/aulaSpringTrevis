package com.bosch.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bosch.example.dto.User;

@RestController
public class TestController {
    
    @GetMapping("/test")
    public String test(@RequestBody User user) {
        if (user.name()== null || user.name().isEmpty()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "name is missing"
            );
        }else if (user.email() == null || user.email().isEmpty()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "email is missing"
            );
        }else if (user.password() == null || user.password().isEmpty()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "password is missing"
            );
        }

        return user.name();
    }
}