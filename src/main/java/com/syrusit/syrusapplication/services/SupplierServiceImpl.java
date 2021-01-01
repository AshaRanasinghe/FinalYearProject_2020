package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Supplier;
import com.syrusit.syrusapplication.repositary.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService{

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public void save(Supplier g) {
    supplierRepository.save(g);
    }

    @Override
    public void update(Supplier g) {
        supplierRepository.save(g);

    }

    @Override
    public void delete(Supplier g) {
        supplierRepository.delete(g);

    }

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findBySupplierName(String status) {
        return null;
    }

    @Override
    public Supplier findById(int id) {
        return supplierRepository.findById(id).get();
    }


}
