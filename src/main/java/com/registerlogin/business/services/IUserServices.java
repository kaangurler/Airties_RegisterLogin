package com.registerlogin.business.services;

import com.registerlogin.business.dto.UserDto;
import com.registerlogin.data.entity.UserEntity;
import java.util.List;
import java.util.Optional;

public interface IUserServices {

    //model mapper
    public UserDto EntityToDto(UserEntity userEntity);
    public UserEntity DtoToEntity(UserDto userDto);

    //save (register)
    public UserDto createUser(UserDto userDto);

    //List
    public List<UserDto> getAllUser();

    //find
    public Optional<UserEntity> findUsername(String username);
}
