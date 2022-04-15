package com.example.demo.configuration;

import com.example.demo.service.ServiceWithParams;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public ServiceWithParams makeServiceWithParams(String par) {
        System.out.println("makeServiceWithParams: " + par);
        return new ServiceWithParams(par);
    }
    
}
