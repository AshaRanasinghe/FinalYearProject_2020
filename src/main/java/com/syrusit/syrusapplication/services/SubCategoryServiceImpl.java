package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.SubCategory;
import com.syrusit.syrusapplication.repositary.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    public SubcategoryRepository subcategoryRepository;

    @Override
    public void save(SubCategory s){
        subcategoryRepository.save(s);
    }

    @Override
    public void update(SubCategory s) {
        subcategoryRepository.save(s);
    }

    @Override
    public void delete(SubCategory s) {
        subcategoryRepository.delete(s);
    }

    @Override
    public List<SubCategory> findByName(String name) {
        return subcategoryRepository.findByName(name);
    }
}
