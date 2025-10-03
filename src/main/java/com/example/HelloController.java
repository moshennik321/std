package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, zdarova";
    }

    @GetMapping("/greet")
    public String greetUser(String name) {
        return "Hello, " + (name != null ? name : "mops") + "!";
    }
}
