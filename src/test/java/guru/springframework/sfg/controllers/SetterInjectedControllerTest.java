package guru.springframework.sfg.controllers;

import guru.springframework.sfg.services.ConstructorGreetingSerivce;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingSerivce());

    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}