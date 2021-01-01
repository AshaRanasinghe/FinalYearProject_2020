package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.UserRole;
import com.syrusit.syrusapplication.repositary.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void save(UserRole role) { roleRepository.save(role); }

    @Override
    public void update(UserRole role) { roleRepository.save(role); }

    @Override
    public void delete(UserRole role) {
        roleRepository.delete(role);
    }

    @Override
    public List<UserRole> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public UserRole findById() {
        return null;
    }
}
