package com.registerlogin.business.services;

import com.registerlogin.business.dto.UserDto;

public interface IAuthenticationService {

    String loginReturnJwt(UserDto userDto);
}
