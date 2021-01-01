package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {


    public void save(Customer g);

    public void update(Customer g);

    public void delete(Customer g);

    public List<Customer> findAll();

    public Customer findById(int id);

    public Customer findByNIC(String nic);

    public List<Customer> findByStatus(boolean status);

}
