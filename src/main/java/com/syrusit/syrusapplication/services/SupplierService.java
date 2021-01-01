package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {

    public void save(Supplier s);

    public void update(Supplier s);

    public void delete(Supplier s);

    public List<Supplier> findAll();

    public Supplier findBySupplierName(String name);

    public Supplier findById(int id);


}
