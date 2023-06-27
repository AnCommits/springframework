package org.example.springframework.config;

//import org.example.springframework.dto.PersonDto;
//import org.example.springframework.service.PersonService;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("org.example.springframework")
public class SpringConfig {
}
