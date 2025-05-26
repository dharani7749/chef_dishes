package com.example.Chef_dishes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Chef_dishes.model.Dish;
import com.example.Chef_dishes.service.DishService;

@RestController
@RequestMapping("v1/api/dishes")
@CrossOrigin("*")
public class DishController {
    @Autowired
    private DishService service;

    @GetMapping
    public List<Dish> list() { return service.getAll(); }

    @PostMapping
    public Dish add(@RequestBody Dish dish) { return service.save(dish); }

    @GetMapping("/{id}")
    public Dish get(@PathVariable Long id) { return service.getById(id); }

    @PutMapping("/{id}")
    public Dish update(@PathVariable Long id, @RequestBody Dish dish) {
        dish.setId(id);
        return service.save(dish);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}