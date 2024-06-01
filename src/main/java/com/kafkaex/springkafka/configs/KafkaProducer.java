package com.kafkaex.springkafka.configs;

import com.kafkaex.springkafka.Model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    @Autowired
    private KafkaTemplate<String,Person> jsonTemplate;

    public void  publish(String message) {
        logger.info(String.format("message sent is  : %s",message));
        kafkaTemplate.send("pets",message);
    }

    public void publishJson(Person person) {
        logger.info(String.format("Jsonmessage sent is  : %s",person.toString()));

        Message<Person> message = MessageBuilder.withPayload(person)
                .setHeader(KafkaHeaders.TOPIC,"kafkajson")
                .build();

        jsonTemplate.send(message);
    }

}


