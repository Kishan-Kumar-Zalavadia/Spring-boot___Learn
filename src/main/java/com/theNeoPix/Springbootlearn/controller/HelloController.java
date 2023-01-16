package com.theNeoPix.Springbootlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloPix(){
        return "Welcome TheNeoPix again!!";
    }
}
