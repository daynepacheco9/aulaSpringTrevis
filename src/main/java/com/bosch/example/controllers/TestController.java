package com.bosch.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/test")
    public Integer test(Integer a, Integer b) {
        return a + b;
    }
}