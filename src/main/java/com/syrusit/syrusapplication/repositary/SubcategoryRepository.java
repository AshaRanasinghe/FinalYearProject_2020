package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoryRepository extends JpaRepository<SubCategory,String> , SubcategoryCustomRepository{
    public List<SubCategory> findByName(String name);
}

