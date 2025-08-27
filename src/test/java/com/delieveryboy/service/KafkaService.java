package com.delieveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    
}
