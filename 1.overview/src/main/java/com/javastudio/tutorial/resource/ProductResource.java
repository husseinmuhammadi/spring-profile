package com.javastudio.tutorial.resource;

import com.javastudio.tutorial.cfg.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductResource {

    @Autowired
    private Specification specification;

    @GetMapping("/brand")
    public String brand() {
        return specification.getBrand();
    }
}
