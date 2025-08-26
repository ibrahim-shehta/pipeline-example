package com.pipeline.example.pipeline_example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @Value("${config.message}")
    private String msg;

    @GetMapping("/msg")
    public String hello() {
        return "message: 1- " + msg;
    }
}
