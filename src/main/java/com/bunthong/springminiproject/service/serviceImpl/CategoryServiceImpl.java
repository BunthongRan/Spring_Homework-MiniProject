package com.bunthong.springminiproject.service.serviceImpl;

import com.bunthong.springminiproject.model.Category;
import com.bunthong.springminiproject.repository.CategoryRepository;
import com.bunthong.springminiproject.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;

    CategoryServiceImpl(){categoryRepository = new CategoryRepository(); }

    @Override
    public Category getCategoryById(int id) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public void addCategory(Category category) {

    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public void deleteCategory(int id) {

    }
}