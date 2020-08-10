package com.syrusit.syrusapplication.repositary.entity;

import com.syrusit.syrusapplication.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {//<Item, Integer> is a entity class which extends and data type of the primary key

}
