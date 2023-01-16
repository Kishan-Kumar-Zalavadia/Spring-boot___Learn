package com.theNeoPix.Springbootlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String helloPix(){
        return "Welcome TheNeoPix";
    }
}
