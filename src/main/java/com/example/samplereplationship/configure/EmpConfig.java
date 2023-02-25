package com.example.samplereplationship.configure;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
