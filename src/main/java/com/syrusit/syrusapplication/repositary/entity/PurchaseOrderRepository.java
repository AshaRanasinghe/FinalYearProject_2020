package com.syrusit.syrusapplication.repositary.entity;

import com.syrusit.syrusapplication.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder,Integer> {
}
