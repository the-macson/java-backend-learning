package com.macson.menu.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Data
@Table(name = "categorys")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String name;
    private Boolean isActive;

    @Setter
    @Getter
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Collection<Product> product;
}
