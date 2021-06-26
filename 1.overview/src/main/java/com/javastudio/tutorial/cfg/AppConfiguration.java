package com.javastudio.tutorial.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Value("${spring.application.name}")
    private String name;

    public String getName() {
        return name;
    }
}
