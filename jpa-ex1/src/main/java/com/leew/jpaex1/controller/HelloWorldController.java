package com.leew.jpaex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @GetMapping("/get")
    public String getHello() {
        return "Hello, World!";
    }
}