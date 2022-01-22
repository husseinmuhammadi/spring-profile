package com.javastudio.tutorial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("stage")
public class StageConfiguration implements RuntimeConfiguration {
    @Override
    public String getActiveProfile() {
        return "stage";
    }
}
