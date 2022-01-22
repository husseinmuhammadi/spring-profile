package com.javastudio.tutorial;

import com.javastudio.tutorial.config.EmailConfigProperties;
import com.javastudio.tutorial.config.EnvironmentConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({EmailConfigProperties.class, EnvironmentConfigProperties.class})
@SpringBootApplication
public class EnableConfigurationDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnableConfigurationDemoApplication.class, args);
    }
}
