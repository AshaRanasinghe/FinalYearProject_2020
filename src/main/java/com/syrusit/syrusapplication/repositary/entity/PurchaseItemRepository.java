package com.syrusit.syrusapplication.repositary.entity;

import com.syrusit.syrusapplication.entity.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem,Integer> {
}
