package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "Hello World:" + name;
    }
}
