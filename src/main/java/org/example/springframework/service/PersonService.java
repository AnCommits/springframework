package org.example.springframework.service;

import org.example.springframework.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    @Autowired
    private PersonDto personDto;

    public String getPersonName() {
        return personDto.getName();
    }
}
