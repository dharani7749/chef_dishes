package com.example.Chef_dishes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Chef_dishes.model.Dish;
import com.example.Chef_dishes.repository.DishRepository;


    @Service
public class DishService {
    @Autowired
    private DishRepository repo;

    public List<Dish> getAll() { return repo.findAll(); }
    public Dish getById(Long id) { return repo.findById(id).orElse(null); }
    public Dish save(Dish dish) { return repo.save(dish); }
    public void delete(Long id) { repo.deleteById(id); }
}