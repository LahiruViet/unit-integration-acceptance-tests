package com.example.demo.service.impl;

import com.example.demo.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public String getWelcomeMessage(String name) {
        return String.format("Welcome %s!", name);
    }
}
