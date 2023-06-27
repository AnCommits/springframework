package org.example.springframework;

// Spring без Boot

import org.example.springframework.config.SpringConfig;
import org.example.springframework.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService service = context.getBean(PersonService.class);
        System.out.println(service.getPersonName());
    }
}
