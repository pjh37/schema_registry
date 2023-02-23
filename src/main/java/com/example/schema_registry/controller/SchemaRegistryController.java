package com.example.schema_registry.controller;

import com.example.schema_registry.domain.Schema;
import com.example.schema_registry.domain.SchemaResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SchemaRegistryController {

    @PostMapping("/scheme/registry")
    public void registry(@RequestBody Schema request){
        try{
            String schemaString = new ObjectMapper().writeValueAsString(request.getSchema());
            log.info("스키마 내용 = {}",schemaString);
            Mono<SchemaResponse> schemaMono = create(new Schema(schemaString));
            SchemaResponse response = schemaMono.block();
            assert response != null;
            log.info("응답 = {}", response);
        }catch (Exception e){
            log.info("ErrMsg = {}",e.getMessage());
        }
    }
    public Mono<SchemaResponse> create(Schema schema) {
        WebClient webClient= WebClient.builder().build();
        return webClient.post()
                .uri("http://localhost:8086/subjects/user/versions")
                .header("Content-Type","application/vnd.schemaregistry.v1+json")
                .body(Mono.just(schema), Schema.class)
                .retrieve()
                .bodyToMono(SchemaResponse.class);
    }
}
