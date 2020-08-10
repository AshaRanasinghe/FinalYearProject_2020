package com.syrusit.syrusapplication.repositary.entity;

import com.syrusit.syrusapplication.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeCustomeRepositoryImpl {

    // public Employee findByNic(String nic);

    //  public Employee findByMobile(String mobile);

    public List<Employee> findByStatus(boolean status);
}

