package com.javastudio.tutorial.runner;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpecificationLogging implements CommandLineRunner {

    private final Logger logger;

    @Autowired
    public SpecificationLogging(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("ddddddddddddddddddddddddddddddddddddddddddddddddd");
    }
}
