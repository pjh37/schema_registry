package com.example.schema_registry.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
//    private int age;
    private String name;
    private String carID;

    public User(int id, int age, String name) {
        this.id = id;
//        this.age = age;
        this.name = name;
    }
}
