package com.example.schema_registry.service;


import com.example.schema_registry.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
//@KafkaListener(id="multiGroup",topics = "multitype")
public class KafkaConsumer {
    @KafkaListener(id="multiGroup",topics = "user")
    public void handleUser(ConsumerRecord<String, User> record) throws JsonProcessingException {
        System.out.println("com.example.schema_registry.avro.User received: " + record.value());
    }
//
//    @KafkaHandler
//    public void handleComment(Comment comment) {
//        System.out.println("Comment received: " + comment);
//    }
}
