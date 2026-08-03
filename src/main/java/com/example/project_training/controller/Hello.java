package com.example.project_training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    
    @GetMapping("/hello")
    public String getMethodName() {
        return "création d'une nouvelle branche";
    }
    
}
