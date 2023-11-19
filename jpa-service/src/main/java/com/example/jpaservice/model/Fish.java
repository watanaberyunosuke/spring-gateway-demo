package com.example.jpaservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.util.Objects;

@Table(name = "fish")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Fish implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "fish_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "sell")
    private Double price;
    @Column(name = "location")
    private String location;
    @Column(name = "difficulty")
    private String difficulty;
    @Column(name = "size")
    private String size;
    @Column(name = "vision")
    private String vision;
    @Column(name = "description")
    private String description;

}
