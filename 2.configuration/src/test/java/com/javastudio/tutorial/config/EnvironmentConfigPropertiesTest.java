package com.javastudio.tutorial.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("stage")
class EnvironmentConfigPropertiesTest {
    @Autowired
    private EnvironmentConfigProperties environmentConfigProperties;

    @Test
    void givenConfigurationProperties_whenConfigureEmailConfigProperties_thenHostIsGmailSmtp(){
        assertNotNull(environmentConfigProperties);
        assertEquals(environmentConfigProperties.getName(), "stage");
    }
}