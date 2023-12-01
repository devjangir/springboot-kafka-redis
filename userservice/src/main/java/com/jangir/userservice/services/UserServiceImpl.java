package com.jangir.userservice.services;

import com.jangir.userservice.dtos.UserDto;
import com.jangir.userservice.dtos.UserRequestDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public UserDto addUser(UserRequestDto userRequestDto) {
        return UserDto.from(userRequestDto);
        // Need to save to Redis and send a notification to Kafka Notification Service
    }

    @Override
    public UserDto getUser(String userId) {

        return null;
    }

    @Override
    public void updateUser(UserRequestDto userRequestDto, String userId) {

    }
}
