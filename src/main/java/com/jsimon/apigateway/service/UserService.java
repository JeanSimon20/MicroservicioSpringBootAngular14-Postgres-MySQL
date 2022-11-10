package com.jsimon.apigateway.service;

import com.jsimon.apigateway.model.Role;
import com.jsimon.apigateway.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void ChangeRole(Role newRole, String username);
}
