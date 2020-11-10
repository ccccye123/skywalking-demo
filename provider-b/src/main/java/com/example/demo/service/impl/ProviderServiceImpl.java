package com.example.demo.service.impl;

import com.example.demo.service.ProviderService;
import org.springframework.stereotype.Service;


/**
 * @author ccccye
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String hello() {
        return "provider service: Hello!";
    }
}
