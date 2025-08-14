package com.kavish.tutorials.kafka.producer.controller;

import com.kavish.tutorials.kafka.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class ProducerController {
    @Autowired
    private ProducerService producer;

    @PostMapping("/publish")
    public String sendMessage(@RequestParam String topic, @RequestParam String message) {
        producer.sendMessage(topic, message);
        return "Message sent to Kafka topic: " + topic;
    }
}

