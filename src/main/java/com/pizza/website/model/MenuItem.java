package com.pizza.website.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "menu")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String imagePath;
}
