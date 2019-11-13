package com.adechinan.sbmultipleinterfaceimplementation.factory;

import org.springframework.stereotype.Component;

// Do not put @Qualifier here in order to make use of factory pattern
@Component
public class Drama implements Book {

    @Override
    public String info() {

        return "Drama";
    }
}
