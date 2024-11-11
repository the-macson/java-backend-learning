package com.macson.menu.service;

import com.macson.menu.model.Category;
import com.macson.menu.model.Product;
import com.macson.menu.repo.CategoryRepo;
import com.macson.menu.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product addProduct(String catId, String name) {
        Category category = categoryRepo.findById(catId).orElse(null);
        Product newProduct = new Product();
        newProduct.setCategory(category);
        newProduct.setName(name);

        return productRepo.save(newProduct);
    }
}
