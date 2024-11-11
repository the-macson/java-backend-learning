package com.macson.menu.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonBackReference
    private Category category;
}
