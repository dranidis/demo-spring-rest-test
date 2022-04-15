package com.example.demo.service;

public class ServiceWithParams {

    private String par;

    public ServiceWithParams(String par) {
        System.out.println("Start Service created par: " + par);
        this.par = par;
    }

    public String start(String name) {
        return String.format("start %s %s!", par, name);
    }

}
