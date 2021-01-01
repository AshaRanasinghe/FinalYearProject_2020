package com.syrusit.syrusapplication.repositary;


import com.syrusit.syrusapplication.entity.Employee;

import java.util.List;

public class EmployeeCustomRepositoryimpl implements EmployeeCustomRepository {

    @Override
    public Employee findByNic(String nic) {
        return null;
    }

    @Override
    public List<Employee> findByStatus(boolean status) {
        return null;
    }
}
