package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.UserRole;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface RoleService {

    public void save(UserRole role);

    public void update(UserRole role);

    public void delete(UserRole role);

    public List<UserRole> findAll();

    public UserRole findById();
}
