package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.PurchaseItem;

import java.util.List;

public interface PurchaseItemService {
    public List<PurchaseItem> findAll();
    public void save (PurchaseItem purchaseItem);
    public  void  update(PurchaseItem purchaseItem);
    public void delete (PurchaseItem purchaseItem);
    public PurchaseItem findById(Integer id);
}
