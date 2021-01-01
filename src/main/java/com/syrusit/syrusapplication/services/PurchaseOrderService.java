package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderService {

    public void save (PurchaseOrder pOrder);

    public void update (PurchaseOrder pOrder);

    public void delete (PurchaseOrder pOrder);

    public List<PurchaseOrder> findAll();

    public PurchaseOrder findById(int id);
}
