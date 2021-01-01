package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}
