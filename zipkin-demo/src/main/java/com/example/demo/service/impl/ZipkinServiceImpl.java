package com.example.demo.service.impl;

import com.example.demo.service.ZipkinService;
import org.springframework.stereotype.Service;


/**
 * @author ccccye
 */
@Service
public class ZipkinServiceImpl implements ZipkinService {

    @Override
    public String hello() {
        return "service hello";
    }
}
