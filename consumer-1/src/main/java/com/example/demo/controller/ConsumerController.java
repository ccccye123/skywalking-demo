package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ccccye
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @GetMapping(value = "/demo")
    public String demo(){
        return "demo";
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
