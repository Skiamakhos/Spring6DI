package com.skiamakhos.spring6di.services.i18n;

import com.skiamakhos.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class GreetingServiceEnglish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Alright mate?";
    }
}
