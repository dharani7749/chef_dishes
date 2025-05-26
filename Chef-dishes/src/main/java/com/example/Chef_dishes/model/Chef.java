
package com.example.Chef_dishes.model;

import jakarta.persistence.*;

@Entity
public class Chef {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        private String name;
        private int experience;
        private String speciality;
        private String imageUrl;
    
        // Getters and Setters
    }