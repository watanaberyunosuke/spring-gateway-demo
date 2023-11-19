package com.example.jpaservice.service;

import com.example.jpaservice.exception.ResourceNotFoundException;
import com.example.jpaservice.model.Fish;
import com.example.jpaservice.repository.FishRepository;
import com.example.jpaservice.response.FishResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FishService {

    @Autowired
    private FishRepository fishRepository;

    public FishResponse getFishById(int id) {

        Optional<Fish> fishOptional = fishRepository.findById(id);

        if (fishOptional.isPresent()) {
            Fish fish = fishOptional.get();
            return new FishResponse(fish.getId(), fish.getName(), fish.getPrice(), fish.getLocation(), fish.getDifficulty(), fish.getSize(), fish.getVision(), fish.getDescription());
        } else {
            throw new ResourceNotFoundException("Fish not found for ID: " + id);

        }
    }
}
