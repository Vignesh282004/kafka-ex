package com.kafkaex.springkafka.configs;

import com.kafkaex.springkafka.Model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@Service
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "pets",groupId = "mypet")
    public void consuem(String message) {
        logger.info(String.format("message recieved is : %s",message));
    }

}
