package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.user;
import com.syrusit.syrusapplication.repositary.entity.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(user g) {userRepository.save(g);}

    @Override
    public void update(user g) {userRepository.save(g);}

    @Override
    public void delete(user g) {userRepository.delete(g);}

    @Override
    public List<user> findAll() { return userRepository.findAll(); }

    @Override
    public user findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }
}