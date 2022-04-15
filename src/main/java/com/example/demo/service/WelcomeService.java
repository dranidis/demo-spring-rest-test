package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

    public WelcomeService() {
        System.out.println("Service created");
    }

    public String welcome(String name) {
        return String.format("Welcome %s!", name);
    }

    
}
