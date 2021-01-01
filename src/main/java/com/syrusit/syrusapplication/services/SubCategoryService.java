package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.SubCategory;

import java.util.List;

public interface SubCategoryService {

    public void save(SubCategory s);

    public void update(SubCategory s);

    public void delete(SubCategory s);

    public List<SubCategory> findByName(String name);
}
