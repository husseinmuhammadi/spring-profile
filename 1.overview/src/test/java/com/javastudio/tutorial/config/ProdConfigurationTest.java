package com.javastudio.tutorial.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("prod")
class ProdConfigurationTest {

    @Autowired
    private RuntimeConfiguration configuration;

    @Test
    void givenProdProfile_whenCreateConfigurationBean_thenActiveProfileIsProduction() {
        assertEquals(configuration.getActiveProfile(), "prod");
    }
}