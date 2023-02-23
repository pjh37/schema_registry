package com.example.schema_registry.controller;


import com.example.schema_registry.avro.User;
import com.example.schema_registry.domain.Comment;
import com.example.schema_registry.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {
    private final KafkaProducer kafkaProducer;

    @GetMapping("/comment")
    public void comment(){
        kafkaProducer.send(new Comment(1,"comment content"));
    }

    @GetMapping("/user")
    public void user(){
        User user=User.newBuilder()
                .setAge(99)
                .setId(12)
                .setName("999name")
                .setCarID("567657856")
                .build();
        kafkaProducer.send(user);
    }
}
