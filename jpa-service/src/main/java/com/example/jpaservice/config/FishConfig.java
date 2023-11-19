package com.example.jpaservice.config;

import com.example.jpaservice.service.FishService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FishConfig {

    @Bean
    public FishService fishBean() {
        return new FishService();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
