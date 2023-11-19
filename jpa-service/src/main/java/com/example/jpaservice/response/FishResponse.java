package com.example.jpaservice.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FishResponse {

    private int id;
    private String name;
    private Double sell;
    private String location;
    private String difficulty;
    private String size;
    private String vision;
    private String description;

}
