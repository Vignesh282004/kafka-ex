package com.kafkaex.springkafka.configs;

import com.kafkaex.springkafka.Model.Person;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonConstumer {

    private static final Logger logger = LoggerFactory.getLogger(JsonConstumer.class);
    @KafkaListener(topics = "kafkajson",groupId = "mystrings")
    public void getmsesage(Person person) {
        logger.info(String.format("Json message recirved is %s : ",person.toString()));
    }

}
