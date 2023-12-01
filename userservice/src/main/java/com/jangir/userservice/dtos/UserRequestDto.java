package com.jangir.userservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    String firstName;
    String lastName;
    String email;
    String mobileNumber;
}
