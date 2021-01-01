package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeCustomRepository {

    public Employee findByNic (String nic);

   public List<Employee> findByStatus(boolean status);
}

