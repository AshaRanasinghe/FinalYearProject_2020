package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Gender;
import com.syrusit.syrusapplication.entity.user;

import java.util.List;

public interface UserService {

    public void save(user g);

    public void update(user g);

    public void delete(user g);

    public List<user> findAll();

    public user findByUserName(String userName);
}
