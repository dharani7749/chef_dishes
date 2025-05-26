package com.example.Chef_dishes.repository;

import com.example.Chef_dishes.model.Chef;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChefRepository extends JpaRepository<Chef, Long> {
}
