package com.adechinan.sbmultipleinterfaceimplementation.domain;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRunner implements CommandLineRunner {


    @Autowired
    @Qualifier("student")
    private Person p1;

    @Autowired
    @Qualifier("manager")
    private Person p2;

    @Override
    public void run(String... args) throws Exception {

        log.info("{}", p1.info());
        log.info("{}", p2.info());
    }
}