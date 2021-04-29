package com.rleon.kafkademo.springbootP02Kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {


    @KafkaListener(topics = "test_topic", groupId = "group_id")
    protected void consumeMessage(String message) {
        System.out.println(message);
    }
}
