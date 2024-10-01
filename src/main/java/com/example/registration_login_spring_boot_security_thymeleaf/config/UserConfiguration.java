package com.example.registration_login_spring_boot_security_thymeleaf.config;

import com.example.registration_login_spring_boot_security_thymeleaf.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class UserConfiguration {

    private final UserService userService;

    public UserConfiguration(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public SecurityFilterChain config(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(
                (request)->request.requestMatchers(
                        "/registration**",
                        "/js/**",
                        "/css/**",
                        "/img/**"
                ).permitAll().anyRequest().authenticated()
        ).formLogin(
                (login)->login.loginPage("/login")
                        .permitAll()
        ).logout(
                (logout)->logout
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/login?logout")
                        .permitAll()

        )
        ;
        return http.build();
    }


    @Bean
    public static BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(bCryptPasswordEncoder());
        return auth;
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }
}
