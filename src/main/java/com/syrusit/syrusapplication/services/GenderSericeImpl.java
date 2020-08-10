package com.syrusit.syrusapplication.services;


import com.syrusit.syrusapplication.entity.Gender;
import com.syrusit.syrusapplication.repositary.entity.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenderSericeImpl implements GenderService{

    @Autowired // enable dependance injection feature
    private GenderRepository genderRepository;

    @Override
    public void save(Gender g) {
        genderRepository.save(g);

    }

    @Override
    public void update(Gender g) {
        genderRepository.save(g);

    }

    @Override
    public void delete(Gender g) {
        genderRepository.delete(g);

    }

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

}
