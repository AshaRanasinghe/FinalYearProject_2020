package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Invoice;
import com.syrusit.syrusapplication.repositary.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class InvoiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public void save(Invoice i) {
        invoiceRepository.save(i);
    }

    @Override
    public void update(Invoice i) {
        invoiceRepository.save(i);
    }

    @Override
    public void delete(Invoice i) {
    invoiceRepository.delete(i);
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice findById(int id) {
        return invoiceRepository.findById(id).get();
    }

    @Override
    public Invoice findByNIC(String nic) {
        return null;
    }

    @Override
    public List<Invoice> findByStatus(boolean status) {
        return null;
    }
}
