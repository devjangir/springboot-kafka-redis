package com.jangir.notificationservice.service;

import com.jangir.notificationservice.constants.KafkaConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @KafkaListener(topics = KafkaConstants.TOPIC, groupId = KafkaConstants.GROUP_ID)
    void consumeUserServiceMessage(String message) {
        System.out.println("Notification Service: " + message);
    }
}
