package com.miranda.growappbackendpublic.security.services;

import com.miranda.growappbackendpublic.model.User;
import com.miranda.growappbackendpublic.repository.NewUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    NewUserRepository newUserRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = newUserRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Användaren hittades inte med användarnamnet: " + username));
        return UserDetailsImpl.build(user);
    }
}
