package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.Category;

import java.util.List;

public interface CategoryCustomRepository{

    public List<Category> findByName (String name);

}
