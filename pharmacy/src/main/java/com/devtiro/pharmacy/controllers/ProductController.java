package com.devtiro.pharmacy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/hello")//pour recuperer data

    public String hello(){
        return "hello world";
    }
}
