package com.example.demo.controller;

import com.example.demo.service.ServiceWithParams;
import com.example.demo.service.WelcomeService;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    private ObjectProvider<ServiceWithParams> startServiceProvider;

    @Autowired
    public WelcomeController(ObjectProvider<ServiceWithParams> startServiceProvider) {
        this.startServiceProvider = startServiceProvider;
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(defaultValue = "Jim") String name) {
        return welcomeService.welcome(name);
    }
    
    @GetMapping("/start")
    public String start(@RequestParam(defaultValue = "start-par") String name) {
        ServiceWithParams startService = startServiceProvider.getObject("with-par");
        return startService.start(name);
    }    
}
