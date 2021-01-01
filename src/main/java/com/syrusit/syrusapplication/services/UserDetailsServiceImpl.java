package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.SystemUser;
import com.syrusit.syrusapplication.repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
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
       SystemUser usr = userRepository.findByUsername(username);
       if(usr==null)
    System.out.println("User not found");

       List<GrantedAuthority> roleList = new ArrayList();

       roleList.add(new SimpleGrantedAuthority(usr.getRole().getName()));

       UserDetails uDetails = new User(usr.getUsername(),usr.getPassword(),roleList);

        return uDetails;



    }
}
