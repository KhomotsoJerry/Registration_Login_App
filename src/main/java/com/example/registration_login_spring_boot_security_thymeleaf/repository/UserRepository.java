package com.example.registration_login_spring_boot_security_thymeleaf.repository;

import com.example.registration_login_spring_boot_security_thymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
     User findByEmail(String email);
}
