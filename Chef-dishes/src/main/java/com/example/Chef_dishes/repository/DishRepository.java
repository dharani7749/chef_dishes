package com.example.Chef_dishes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Chef_dishes.model.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {
    
}