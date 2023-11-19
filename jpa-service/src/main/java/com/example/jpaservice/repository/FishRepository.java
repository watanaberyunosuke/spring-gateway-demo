package com.example.jpaservice.repository;

import com.example.jpaservice.model.Fish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

//@EnableJpaRepositories
public interface FishRepository extends JpaRepository<Fish, Integer> {
    // Left blank intentionally

}