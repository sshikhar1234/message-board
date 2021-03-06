package com.local.messageboard.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/test")
    public String sayHello(){
        return "Springboot app Message Board running on Apache Tomcat Server";
    }
}
