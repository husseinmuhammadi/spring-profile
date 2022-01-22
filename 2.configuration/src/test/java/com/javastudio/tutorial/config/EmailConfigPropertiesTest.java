package com.javastudio.tutorial.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailConfigPropertiesTest {
    @Autowired
    private EmailConfigProperties emailConfigProperties;

    @Test
    void givenConfigurationProperties_whenConfigureEmailConfigProperties_thenHostIsGmailSmtp(){
        assertNotNull(emailConfigProperties);
        assertEquals(emailConfigProperties.getHost(), "smtp.gmail.com");
    }
}