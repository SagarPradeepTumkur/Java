
package com.example.welcomeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to the Spring Boot Web Application!";
    }
}
