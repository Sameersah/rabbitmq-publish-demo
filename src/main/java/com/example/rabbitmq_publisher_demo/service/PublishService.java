package com.example.rabbitmq_publisher_demo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishService {

  @Autowired
    RabbitTemplate rabbitTemplate;


        public String publishMessage(String message) {
            rabbitTemplate.convertAndSend("queue-1", message);
            return "Message Published successfully";
        }
}
