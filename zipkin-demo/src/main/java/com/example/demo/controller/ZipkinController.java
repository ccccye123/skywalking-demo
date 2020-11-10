package com.example.demo.controller;

import com.example.demo.service.ZipkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ccccye
 */
@RestController
@RequestMapping(value = "/zipkin")
public class ZipkinController {

    @Autowired
    private ZipkinService zipkinService;

    @RequestMapping(value = "/hello")
    public String hello(){
        return zipkinService.hello();
    }
}
