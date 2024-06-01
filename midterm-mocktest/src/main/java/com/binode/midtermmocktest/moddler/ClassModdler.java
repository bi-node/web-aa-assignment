package com.binode.midtermmocktest.moddler;



import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassModdler {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}