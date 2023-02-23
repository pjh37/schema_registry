package com.example.schema_registry.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Schema {
    private Object schema;

    public Schema(Object schema) {
        this.schema = schema;
    }
}
