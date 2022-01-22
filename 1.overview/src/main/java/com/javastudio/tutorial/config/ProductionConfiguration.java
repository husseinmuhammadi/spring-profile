package com.javastudio.tutorial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProductionConfiguration implements RuntimeConfiguration {
    @Override
    public String getActiveProfile() {
        return "prod";
    }
}
