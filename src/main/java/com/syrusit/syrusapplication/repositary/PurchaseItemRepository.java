package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem,Integer> {
}
