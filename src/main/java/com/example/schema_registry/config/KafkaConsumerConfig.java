package com.example.schema_registry.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConsumerConfig {
//    @Value("${spring.kafka.producer.bootstrap-servers}")
//    private String bootstrapAddress;
//    @Bean
//    public RecordMessageConverter multiTypeConverter() {
//        StringJsonMessageConverter converter = new StringJsonMessageConverter();
//        DefaultJackson2JavaTypeMapper typeMapper = new DefaultJackson2JavaTypeMapper();
//        typeMapper.setTypePrecedence(Jackson2JavaTypeMapper.TypePrecedence.TYPE_ID);
//        typeMapper.addTrustedPackages("com.example.schema_registry.domain");
//        Map<String, Class<?>> mappings = new HashMap<>();
//        mappings.put("user", com.example.schema_registry.avro.User.class);
//        mappings.put("comment", Comment.class);
//        typeMapper.setIdClassMapping(mappings);
//        converter.setTypeMapper(typeMapper);
//        return converter;
//    }
//
//    @Bean
//    public ConsumerFactory<String, Object> multiTypeConsumerFactory() {
//        HashMap<String, Object> props = new HashMap<>();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
//        return new DefaultKafkaConsumerFactory<>(props);
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, Object> multiTypeKafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(multiTypeConsumerFactory());
////        factory.setMessageConverter(multiTypeConverter());
//        return factory;
//    }
}
