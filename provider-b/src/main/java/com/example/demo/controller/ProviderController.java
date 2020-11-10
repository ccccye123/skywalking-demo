package com.example.demo.controller;

import com.example.demo.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ccccye
 */
@RestController
@RequestMapping(value = "/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping(value = "/demo")
    public String demo(){
        return "demo";
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return providerService.hello();
    }
}
