package com.example.helloserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public HelloController getHelloController(){
        return new HelloController();
    }
}
