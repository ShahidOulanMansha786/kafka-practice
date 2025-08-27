package com.delieveryboy.service;

import com.delieveryboy.config.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void updateLocation(String location) {
        kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME, location);

    }
}
