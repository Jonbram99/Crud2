package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello() 
    {
        return "Hello world";
    }
    
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Spring Boot Hello World! Example";
    }
}
