package com.example.Microservices_Consumer_Service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import Models.CustomerRequest;
import Models.User;

@Service
public class KafkaConsumerService {
//	@KafkaListener(topics = "customer_topic", groupId = "group_id")
//    public void consume(CustomerRequest customerRequest) {
//        System.out.println("Consumed message: " + customerRequest);
//    }
	
    @KafkaListener(topics = "kafka-spring-producer", groupId = "group_id", containerFactory = "userKafkaListenerFactory")
    public void listenWithHeaders(
            @Payload User message,
            @Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {
        System.out.println("Received Message: \n" + message.getName() + "\nfrom partition: " + partition);
    }
}
