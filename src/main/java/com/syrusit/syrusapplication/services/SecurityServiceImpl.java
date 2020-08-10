package com.syrusit.syrusapplication.services;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService{


    @Override
    public String getLogedInusername() {
        UserDetails details =  (UserDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
        return details.getUsername();
    }
}
