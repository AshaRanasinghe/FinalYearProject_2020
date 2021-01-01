package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Integer>,CategoryCustomRepository {
}
