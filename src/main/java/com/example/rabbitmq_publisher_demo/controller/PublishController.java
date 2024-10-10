package com.example.rabbitmq_publisher_demo.controller;

import com.example.rabbitmq_publisher_demo.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PublishController {

    @Autowired
    private PublishService publishService;


    @PostMapping("/publish")
    @ResponseBody
    public String publishMessage(@RequestBody String message) {
        return publishService.publishMessage(message);
    }

}
