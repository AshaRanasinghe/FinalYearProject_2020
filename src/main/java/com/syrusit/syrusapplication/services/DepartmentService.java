package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Department;
import com.syrusit.syrusapplication.entity.Gender;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DepartmentService {

    public void save(Department d);

    public void update(Department d);

    public void delete(Department d);

    public List<Department> findAll();

}
