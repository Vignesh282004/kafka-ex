package com.kafkaex.springkafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringKafkaApplication{

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaApplication.class, args);
        System.out.println("kafka SpringBoot Started.....");
    }

}
