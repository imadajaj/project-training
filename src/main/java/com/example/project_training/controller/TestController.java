package com.example.project_training.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {


    @GetMapping("/test")
    public String getTest() {
        return "test";
    }


    @GetMapping("/testproduct")
    public String getTestProduct() {
        return "testeproducts";
    }
}
