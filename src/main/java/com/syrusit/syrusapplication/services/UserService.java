package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.SystemUser;

import java.util.List;

public interface UserService {

    public void save(SystemUser g);

    public void update(SystemUser g);

    public void delete(SystemUser g);

    public List<SystemUser> findAll();

    public SystemUser findByUserName(String userName);
}
