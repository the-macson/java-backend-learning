package com.macson.menu.service;

import com.macson.menu.model.Category;
import com.macson.menu.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }

    public List<Category> findAllCategory() {
        return categoryRepo.findAll();
    }
}
