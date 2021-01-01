package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Department;
import com.syrusit.syrusapplication.repositary.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void save(Department d) {
        departmentRepository.save(d);

    }

    @Override
    public void update(Department d) {
        departmentRepository.save(d);
    }

    @Override
    public void delete(Department d) {

    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
