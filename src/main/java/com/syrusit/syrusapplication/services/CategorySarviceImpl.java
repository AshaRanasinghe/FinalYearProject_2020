package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Category;
import com.syrusit.syrusapplication.repositary.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class CategorySarviceImpl implements CategoryService  {

    @Autowired
    public CategoryRepository categoryRepository;

    @Override
    public void save(Category c) {
     categoryRepository.save(c);

    }

    @Override
    public void update(Category c) {
        categoryRepository.save(c);

    }

    @Override
    public void delete(Category c) {
        categoryRepository.delete(c);
    }

    @Override
    public List<Category> findByName(String name) {
        return categoryRepository.findByName(name);
    }


}
