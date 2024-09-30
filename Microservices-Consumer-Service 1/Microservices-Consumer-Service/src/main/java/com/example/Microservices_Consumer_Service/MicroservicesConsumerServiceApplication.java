package com.example.Microservices_Consumer_Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;



import Models.CustomerRequest;

@SpringBootApplication
public class MicroservicesConsumerServiceApplication {
    //private Logger logger = LoggerFactory.getLogger(MicroservicesConsumerServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesConsumerServiceApplication.class, args);
    }

//    @KafkaListener(topics = "customer_topic", groupId = "group_id")
//    public void consume(CustomerRequest customerRequest) {
//        logger.info("message consumed");
//        System.out.println("Consumed message: " + customerRequest);
//    }
}