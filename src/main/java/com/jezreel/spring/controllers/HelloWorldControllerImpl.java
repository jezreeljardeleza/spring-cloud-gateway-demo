package com.jezreel.spring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController(value ="/")
public class HelloWorldControllerImpl {
    @GetMapping(path = "/hello")
    public ResponseEntity<String> returnHello() {
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }
}