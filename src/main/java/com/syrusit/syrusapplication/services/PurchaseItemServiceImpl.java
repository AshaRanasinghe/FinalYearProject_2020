package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.PurchaseItem;
import com.syrusit.syrusapplication.repositary.PurchaseItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseItemServiceImpl implements PurchaseItemService {

    @Autowired
    private PurchaseItemRepository purchaseItemRepository;

    @Override
    public List<PurchaseItem> findAll() {
        return purchaseItemRepository.findAll();
    }

    @Override
    public void save(PurchaseItem purchaseItem) {
        purchaseItemRepository.save(purchaseItem);
    }

    @Override
    public void update(PurchaseItem purchaseItem) {
        purchaseItemRepository.save(purchaseItem);

    }

    @Override
    public void delete(PurchaseItem purchaseItem) {
        purchaseItemRepository.delete(purchaseItem);
    }

    @Override
    public PurchaseItem findById(Integer id) {
        return purchaseItemRepository.findById(id).get();
    }

}
