package com.softdev.softdev;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
