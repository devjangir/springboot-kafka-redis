package com.jangir.userservice.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDto {
    String firstName;
    String lastName;
    String email;
    String mobileNumber;

    public static UserDto from(UserRequestDto userRequestDto) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(userRequestDto.getFirstName());
        userDto.setLastName(userRequestDto.getLastName());
        userDto.setEmail(userRequestDto.getEmail());
        userDto.setMobileNumber(userRequestDto.getMobileNumber());
        return userDto;
    }
}
