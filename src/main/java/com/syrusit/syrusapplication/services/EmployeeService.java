package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Designation;
import com.syrusit.syrusapplication.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public void save(Employee g);

    public void update(Employee g);

    public void delete(Employee g);

    public List<Employee> findAll();

    public Employee findById(int id);

    public List<Employee> findByStatus(boolean status);

}

