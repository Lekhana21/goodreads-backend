package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class TestController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/test-encode")
    public String testEncode() {
        String rawPassword = "mySecret123";
        String encodedPassword = passwordEncoder.encode(rawPassword);
        return "Raw: " + rawPassword + "<br>Encoded: " + encodedPassword;
    }
}
