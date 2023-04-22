package com.bunthong.springminiproject.service;

import com.bunthong.springminiproject.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    Category getCategoryById(int id);
    List<Category> getAllCategories();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(int id);
}

