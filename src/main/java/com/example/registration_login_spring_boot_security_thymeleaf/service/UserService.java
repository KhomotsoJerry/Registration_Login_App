package com.example.registration_login_spring_boot_security_thymeleaf.service;

import com.example.registration_login_spring_boot_security_thymeleaf.model.User;
import com.example.registration_login_spring_boot_security_thymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
