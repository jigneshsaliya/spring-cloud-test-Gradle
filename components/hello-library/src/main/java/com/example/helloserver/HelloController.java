package com.example.helloserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HelloController {

    @GetMapping(value="/hello")
    public ResponseEntity<String> getHello(){
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}
