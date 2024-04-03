package guru.springframework.sfg.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingSerivce implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World - Constructor";
    }
}
