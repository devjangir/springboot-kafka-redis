package com.jangir.userservice.controllers;

import com.jangir.userservice.constants.KafkaConstants;
import com.jangir.userservice.dtos.UserDto;
import com.jangir.userservice.dtos.UserRequestDto;
import com.jangir.userservice.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserServiceController {
    KafkaTemplate<String, String> kafkaTemplate;
    UserServiceImpl userService;
    public UserServiceController(KafkaTemplate<String, String> kafkaTemplate, UserServiceImpl userService) {
        this.kafkaTemplate = kafkaTemplate;
        this.userService = userService;
    }

    @PostMapping("/")
    public UserDto createUser(@RequestBody UserRequestDto requestDto) {
        UserDto user = userService.addUser(requestDto);
        kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC, user.toString());
        return user;
    }
}
