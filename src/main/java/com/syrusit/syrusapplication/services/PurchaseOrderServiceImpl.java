package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.PurchaseOrder;
import com.syrusit.syrusapplication.repositary.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Override
    public void save(PurchaseOrder pOrder) {
        purchaseOrderRepository.save(pOrder);
    }

    @Override
    public void update(PurchaseOrder pOrder) {
        purchaseOrderRepository.save(pOrder);
    }

    @Override
    public void delete(PurchaseOrder pOrder) {
        purchaseOrderRepository.delete(pOrder);
    }

    @Override
    public List<PurchaseOrder> findAll() {
        return purchaseOrderRepository.findAll();
    }

    @Override
    public PurchaseOrder findById(int id) {
        return purchaseOrderRepository.findById(id).get();
    }
}
