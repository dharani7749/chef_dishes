package com.example.Chef_dishes.controller;

import org.springframework.web.bind.annotation.*;

import com.example.Chef_dishes.model.Chef;
import com.example.Chef_dishes.service.ChefService;

import java.util.List;

@RestController
@RequestMapping("v1/api/chefs")
@CrossOrigin(origins = "http://localhost:4200")
public class ChefController {
    
        private final ChefService chefService;
    
        public ChefController(ChefService chefService) {
            this.chefService = chefService;
        }
    
        @GetMapping
        public List<Chef> getAllChefs() {
            return chefService.getAllChefs();
        }
    
        @GetMapping("/{id}")
        public Chef getChef(@PathVariable Long id) {
            return chefService.getChefById(id);
        }
    
        @PostMapping
        public Chef createChef(@RequestBody Chef chef) {
            return chefService.saveChef(chef);
        }
    
        @DeleteMapping("/{id}")
        public void deleteChef(@PathVariable Long id) {
            chefService.deleteChef(id);
        }
    }    