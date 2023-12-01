package com.jangir.userservice.services;

import com.jangir.userservice.dtos.UserDto;
import com.jangir.userservice.dtos.UserRequestDto;

public interface IUserService {
    UserDto addUser(UserRequestDto userRequestDto);

    UserDto getUser(String userId);

    void updateUser(UserRequestDto userRequestDto, String userId);
}
