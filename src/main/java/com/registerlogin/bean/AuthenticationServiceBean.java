package com.registerlogin.bean;

import com.registerlogin.business.services.impl.AuthenticationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthenticationServiceBean {

    @Bean
    public AuthenticationServiceImpl authenticationServiceMethodBean(){
        return new AuthenticationServiceImpl();
    }
}