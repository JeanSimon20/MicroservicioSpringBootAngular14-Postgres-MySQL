package com.jsimon.apigateway.service;

import com.jsimon.apigateway.model.Role;
import com.jsimon.apigateway.model.User;
import com.jsimon.apigateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setFechacreacion(LocalDateTime.now());
        return userRepository.save(user);
    }


    @Override
    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public void ChangeRole(Role newRole, String username){
        userRepository.updateRole(username, newRole);
    }

}
