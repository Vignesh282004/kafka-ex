package com.kafkaex.springkafka.configs;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.support.TopicForRetryable;

@Configuration
public class KafkaTopic {
    @Bean
    public NewTopic newTopic() {
        return TopicBuilder
                .name("pets").build();
    }
    @Bean
    public NewTopic mytopic() {
        return TopicBuilder.name("kafkajson").build();
    }
}
