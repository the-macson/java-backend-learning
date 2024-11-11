package com.macson.menu.controller;

import com.macson.menu.model.Category;
import com.macson.menu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @GetMapping
    public List<Category> list() {
        return categoryService.findAllCategory();
    }
}
