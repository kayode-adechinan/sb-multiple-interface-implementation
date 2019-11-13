package com.adechinan.sbmultipleinterfaceimplementation.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookFactory {

    @Bean
    @Qualifier("drama")
    public Book createDrama() {

        return new Drama();
    }

    @Bean
    @Qualifier("horror")
    public Book createHorror() {

        return new Horror();
    }
}