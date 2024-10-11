package com.example.rabbitmq_publisher_demo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishService {

  @Autowired
    RabbitTemplate rabbitTemplate;


        public String publishMessage(String message) {
            for(int i=0; i<1000000; i++){
                rabbitTemplate.convertAndSend("queue-1", message+" "+i);
            }

            return "1,000,000 Messages Published successfully";
        }
}
