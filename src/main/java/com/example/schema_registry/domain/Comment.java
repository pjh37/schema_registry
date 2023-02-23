package com.example.schema_registry.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Comment {
    private int id;
    private String content;

    public Comment(int id, String content) {
        this.id = id;
        this.content = content;
    }
}
