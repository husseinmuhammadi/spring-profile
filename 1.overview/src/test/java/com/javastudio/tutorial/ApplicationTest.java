package com.javastudio.tutorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class ApplicationTest {

    private Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

    private Properties properties;

    @BeforeEach
    void setUp() {
        properties = new Properties();
    }

    @Test
    void givenWinRadioProperties_whenReadAllProperties_thenAllSpecificationShouldPrint() {
        try (InputStream in = getClass().getClassLoader().getResourceAsStream("specification.properties")) {
            properties.load(in);
            properties.forEach((o, o2) -> {
                logger.info("{}: {}", o, o2);
            });
        } catch (IOException e) {
            logger.error("Error reading properties ", e);
        }
    }
}