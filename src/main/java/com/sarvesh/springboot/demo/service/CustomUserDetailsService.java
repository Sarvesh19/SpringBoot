package com.sarvesh.springboot.demo.service;

//import com.javatechie.jwt.api.entity.User;
//import com.javatechie.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired
//    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //User user = repository.findByUserName(username);
        return new org.springframework.security.core.userdetails.User("sarvesh", "sarvesh123", new ArrayList<>());
    }
}
