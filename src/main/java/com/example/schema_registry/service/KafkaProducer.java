package com.example.schema_registry.service;


import com.example.schema_registry.avro.User;
import com.example.schema_registry.domain.Comment;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<Object,Object> kafkaTemplate;
    public void send(Comment comment){
        kafkaTemplate.send("multitype",comment);
    }

    public void send(User user){
        kafkaTemplate.send("user",user);
    }
}
