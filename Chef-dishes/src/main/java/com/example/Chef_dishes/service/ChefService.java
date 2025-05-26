package com.example.Chef_dishes.service;

import com.example.Chef_dishes.model.Chef;
import com.example.Chef_dishes.repository.ChefRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChefService {

    private final ChefRepository chefRepository;

    public ChefService(ChefRepository chefRepository) {
        this.chefRepository = chefRepository;
    }

    public List<Chef> getAllChefs() {
        return chefRepository.findAll();
    }

    public Chef getChefById(Long id) {
        return chefRepository.findById(id).orElse(null);
    }

    public Chef saveChef(Chef chef) {
        return chefRepository.save(chef);
    }

    public void deleteChef(Long id) {
        chefRepository.deleteById(id);
    }
}
