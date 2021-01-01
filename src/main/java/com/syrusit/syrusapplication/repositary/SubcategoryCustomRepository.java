package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.SubCategory;

import java.util.List;

public interface SubcategoryCustomRepository {

    public List<SubCategory> findByName(String name);
}