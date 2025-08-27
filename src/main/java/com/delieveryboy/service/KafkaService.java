package com.delieveryboy.service;

import com.delieveryboy.config.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger log = LoggerFactory.getLogger(KafkaService.class);

    public void updateLocation(String location) {
        kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME, location);
        log.info("message produced");
    }
}
