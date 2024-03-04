package org.adios.payasos;


import org.adios.payasos.entity.Person;
import org.adios.payasos.service.PersonService;
import org.adios.payasos.storage.PersonStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}