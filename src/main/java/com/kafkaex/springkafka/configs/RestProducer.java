package com.kafkaex.springkafka.configs;

import com.kafkaex.springkafka.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestProducer {
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        kafkaProducer.publish(message);
        return ResponseEntity.ok("Message Sent to the kafka Broker");
    }
    @PostMapping("/publishjson")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Person person) {
        kafkaProducer.publishJson(person);
        return ResponseEntity.ok("Json Message Sent to the kafka Broker");
    }

}
