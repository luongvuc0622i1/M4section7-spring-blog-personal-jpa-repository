package com.codegym.service.category;

import com.codegym.model.Category;
import com.codegym.repository.category.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public Iterable findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void save(Category model) {
        categoryRepository.save(model);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);
    }
}