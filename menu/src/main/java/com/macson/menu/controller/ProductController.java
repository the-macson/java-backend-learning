package com.macson.menu.controller;

import com.macson.menu.model.Product;
import com.macson.menu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Map<String, Object> body) {
        String name = body.get("name").toString();
        String categoryId = body.get("category_id").toString();

        return productService.addProduct(categoryId, name);
    }
}
