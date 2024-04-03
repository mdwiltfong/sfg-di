package guru.springframework.sfg.controllers;

import guru.springframework.sfg.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    private final GreetingService greetingService;
    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingSerivce") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
