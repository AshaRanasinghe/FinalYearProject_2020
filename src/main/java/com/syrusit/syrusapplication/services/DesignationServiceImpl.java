package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Designation;
import com.syrusit.syrusapplication.repositary.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationServiceImpl implements DesignationService{

    @Autowired
    private DesignationRepository designationRepository;


    @Override
    public void save(Designation d) {

    }

    @Override
    public void update(Designation d) {

    }

    @Override
    public void delete(Designation d) {

    }

    @Override
    public List<Designation> findAll() {
        return null;
    }
}
