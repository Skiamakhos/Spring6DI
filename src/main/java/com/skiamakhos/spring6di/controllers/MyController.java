package com.skiamakhos.spring6di.controllers;

import com.skiamakhos.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    GreetingService greetingService;
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
