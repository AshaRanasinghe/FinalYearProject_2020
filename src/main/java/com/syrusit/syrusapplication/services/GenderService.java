package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Gender;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GenderService {

    public void save(Gender g);

    public void update(Gender g);

    public void delete(Gender g);

    public List<Gender> findAll();

}








