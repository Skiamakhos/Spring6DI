package com.skiamakhos.spring6di.services;

import org.springframework.context.annotation.Primary;

import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {
    public String sayGreeting() {
        return "Hello, world!";
    }
}
