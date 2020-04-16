package br.com.southsystem.pockafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "${message.topic.name}", groupId = "group1",
        containerFactory = "groupOneKafkaListenerContainerFactory")
    public void listenGroup1Consumer1(String message) {
        System.out.println("----------Received Messasge in Consumer1 'group1': " + message);
    }

    @KafkaListener(topics = "${message.topic.name}", groupId = "group2")
    public void listenGroup1Consumer2(String message) {
        System.out.println("----------Received Messasge in Consumer2 'group2': " + message);
    }

}
