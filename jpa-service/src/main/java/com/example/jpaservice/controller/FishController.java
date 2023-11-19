package com.example.jpaservice.controller;

import com.example.jpaservice.response.FishResponse;
import com.example.jpaservice.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FishController {

    @Autowired
    private FishService fishService;

    @GetMapping("/fish/{id}")
    public ResponseEntity<FishResponse> getFishDetails(@PathVariable("id") int id) {
        FishResponse fish = fishService.getFishById(id);
        return ResponseEntity.status(HttpStatus.OK).body(fish);
    }
}
