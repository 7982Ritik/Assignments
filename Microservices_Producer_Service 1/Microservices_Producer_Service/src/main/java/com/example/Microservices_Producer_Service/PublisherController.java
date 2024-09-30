package com.example.Microservices_Producer_Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.CustomerRequest;
import Models.User;

@RestController
@RequestMapping("/publish")
public class PublisherController {
	
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    private static final String TOPIC = "Kafka_Example";
//    
//	@PostMapping("/customer")
//    public String publishMessage(String customerRequest) {
//        kafkaTemplate.send(TOPIC, customerRequest);
//        return "Message published successfully";
//    }
	
//	@RequestMapping("/customer1/{customerRequest}")
//    public String publishMessage1(@PathVariable String customerRequest) {
//        //kafkaTemplate.send(TOPIC, customerRequest);
//        return "Message published successfully";
//    }
	
//	@Autowired
//    private KafkaTemplate<String, CustomerRequest> kafkaTemplate;
//	
//	private Logger logger=LoggerFactory.getLogger(PublisherController.class);
//
//    @PostMapping("/customer")
//    public String addCustomer(@RequestBody CustomerRequest customerRequest) {
//        this.kafkaTemplate.send("customer-topic", customerRequest);
//        this.logger.info("message produced");
//        return "Customer added successfully";
//    }
	
    @Autowired
    private KafkaTemplate<String,User> kafkaTemplate;

    private static final String TOPIC = "kafka-spring-producer";

    @GetMapping("/publish/{name}")
    public String postMessage(@PathVariable("name") final String name){
        User user = new User();
        user.setName(name);
        user.setDepartment("Technology");
        user.setSalary(4000000L);
        kafkaTemplate.send(TOPIC, user);

        return "Message Published Successfully";
    }
}
