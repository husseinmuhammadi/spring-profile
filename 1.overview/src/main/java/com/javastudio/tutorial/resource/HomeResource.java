package com.javastudio.tutorial.resource;

import com.javastudio.tutorial.cfg.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @Autowired
    private AppConfiguration cfg;

    @GetMapping
    public String index() {
        return cfg.getName();
    }
}
