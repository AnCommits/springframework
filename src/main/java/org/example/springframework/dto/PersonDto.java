package org.example.springframework.dto;

import org.springframework.stereotype.Component;

@Component
public class PersonDto {
    private String name = "Alex";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
