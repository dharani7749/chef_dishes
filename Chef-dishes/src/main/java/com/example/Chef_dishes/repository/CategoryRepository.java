package com.example.Chef_dishes.repository;

import com.example.Chef_dishes.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
