package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.SystemUser;
import com.syrusit.syrusapplication.repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(SystemUser g) {userRepository.save(g);}

    @Override
    public void update(SystemUser g) {userRepository.save(g);}

    @Override
    public void delete(SystemUser g) {userRepository.delete(g);}

    @Override
    public List<SystemUser> findAll() { return userRepository.findAll(); }

    @Override
    public SystemUser findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }
}