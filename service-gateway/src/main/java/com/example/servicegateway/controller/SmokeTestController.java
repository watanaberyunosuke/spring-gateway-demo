package com.example.servicegateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmokeTestController {

    @GetMapping("/")
    public ResponseEntity<String> getSmokeTest() {
        return ResponseEntity.ok("Smoke test passed");
    }
}
