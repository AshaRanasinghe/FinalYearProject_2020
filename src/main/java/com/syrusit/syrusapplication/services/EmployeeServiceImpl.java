package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Employee;

import com.syrusit.syrusapplication.repositary.entity.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void save(Employee g) {
        employeeRepository.save(g);

    }

    @Override
    public void update(Employee g) {
        employeeRepository.save(g);
    }

    @Override
    public void delete(Employee g) {
        employeeRepository.delete(g);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findByStatus(boolean status) {
        return null;
    }


}
