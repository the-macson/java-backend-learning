package com.macson.menu.repo;

import com.macson.menu.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, String> {
}
