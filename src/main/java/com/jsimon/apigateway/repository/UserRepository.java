package com.jsimon.apigateway.repository;

import com.jsimon.apigateway.model.Role;
import com.jsimon.apigateway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Buscar usuario por Nmmbre
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role =: role where username=:username")
    void updateRole(@Param("username") String username, @Param("role")Role role);
}
