package com.practice.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//define end point, "/" here (default). when end point is hit, this method is executed.
    //to map request to this method
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    //instead of using the above, we can use the below line directly
    //for GET

    @GetMapping("/")
    public String helloWorld(){

        return "Hello World!";
    }

}
