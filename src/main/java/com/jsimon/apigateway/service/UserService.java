package com.jsimon.apigateway.service;

import com.jsimon.apigateway.model.Role;
import com.jsimon.apigateway.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void ChangeRole(Role newRole, String username);
}
