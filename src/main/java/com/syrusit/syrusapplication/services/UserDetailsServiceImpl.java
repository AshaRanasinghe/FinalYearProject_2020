package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.UserRole;
import com.syrusit.syrusapplication.entity.user;
import com.syrusit.syrusapplication.repositary.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       user usr = userRepository.findByUsername(username);
       if(usr==null)
    System.out.println("User not found");

       UserDetails uDetails = new User(usr.getUsername(),usr.getUsername(),null);

        return uDetails;



    }
}
