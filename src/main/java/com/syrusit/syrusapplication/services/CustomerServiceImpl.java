package com.syrusit.syrusapplication.services;


import com.syrusit.syrusapplication.entity.Customer;
import com.syrusit.syrusapplication.repositary.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    public CustomerRepository customerRepository;

    @Override
    public void save(Customer C) {
        customerRepository.save(C);
    }

    @Override
    public void update(Customer C) {
        customerRepository.save(C);
    }

    @Override
    public void delete(Customer C) {
        customerRepository.delete(C);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public Customer findByNIC(String nic) {
        return null;
    }

    @Override
    public List<Customer> findByStatus(boolean status) {
        return null;
    }
}
