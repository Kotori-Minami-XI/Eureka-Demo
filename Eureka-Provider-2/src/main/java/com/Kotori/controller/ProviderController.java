package com.Kotori.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(String name) {
        return name + ", Welcome to Spring Boot. I am provider2";
    }
}