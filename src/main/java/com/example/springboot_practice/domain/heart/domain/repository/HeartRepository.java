package com.example.springboot_practice.domain.heart.domain.repository;

import com.example.springboot_practice.domain.heart.domain.Heart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeartRepository extends CrudRepository<Heart, Long> {
}
