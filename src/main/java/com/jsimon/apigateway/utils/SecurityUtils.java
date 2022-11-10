package com.jsimon.apigateway.utils;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.Serializable;

public class SecurityUtils implements Serializable {

    public static final String ROLE_PREFIX = "ROLE_";
    public static SimpleGrantedAuthority convertToAuthority(String role){
        String formattedRole= role.startsWith(ROLE_PREFIX) ? role:ROLE_PREFIX+role;
        return new SimpleGrantedAuthority(formattedRole);
    }

}
