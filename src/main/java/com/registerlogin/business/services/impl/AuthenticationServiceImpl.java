package com.registerlogin.business.services.impl;

import com.registerlogin.business.dto.UserDto;
import com.registerlogin.business.services.IAuthenticationService;
import com.registerlogin.security.UserPrincipal;
import com.registerlogin.security.jwt.IJwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public class AuthenticationServiceImpl implements IAuthenticationService {

    //injection
    @Autowired
    private  AuthenticationManager authenticationManager;
    @Autowired
    private  IJwtProvider iJwtProvider;

    @Override
    public String loginReturnJwt(UserDto userDto){
        //Authentication ==> UserDto username ve password vermek
        Authentication authentication=authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userDto.getUsername(),userDto.getPassword()));

        // UserPrincipal
        UserPrincipal  userPrincipal= (UserPrincipal) authentication.getPrincipal();

        //IJwtProvider
        return iJwtProvider.generateToken(userPrincipal);
    }
}