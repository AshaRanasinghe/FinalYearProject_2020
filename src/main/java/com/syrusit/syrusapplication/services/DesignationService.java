package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Designation;
import com.syrusit.syrusapplication.entity.Gender;

import java.util.List;

public interface DesignationService {
    public void save(Designation g);

    public void update(Designation g);

    public void delete(Designation g);

    public List<Designation> findAll();


}
