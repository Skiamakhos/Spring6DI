package com.skiamakhos.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Profile("default")
public class GreetingServiceImpl implements GreetingService {
    public String sayGreeting() {
        return "Hello, world!";
    }
}
