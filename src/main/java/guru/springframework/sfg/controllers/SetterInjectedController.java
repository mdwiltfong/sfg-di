package guru.springframework.sfg.controllers;

import guru.springframework.sfg.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }
}
