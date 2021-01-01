package com.syrusit.syrusapplication.services;


import com.syrusit.syrusapplication.entity.Invoice;

import java.util.List;


public interface InvoiceService {

    public void save(Invoice i);

    public void update(Invoice i);

    public void delete(Invoice i);

    public List<Invoice> findAll();

    public Invoice findById(int id);

    public Invoice findByNIC(String nic);

    public List<Invoice> findByStatus(boolean status);

}
