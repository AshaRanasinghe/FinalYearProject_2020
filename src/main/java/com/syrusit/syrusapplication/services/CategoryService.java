package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CategoryService {

    public void save(Category c);

    public void update(Category c);

    public void delete(Category c);

    public List<Category> findByName(String name);


}
