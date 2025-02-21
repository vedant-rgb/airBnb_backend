package com.project.AirBnbApp.service;

import com.project.AirBnbApp.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    User getUserById(Long id);
}
