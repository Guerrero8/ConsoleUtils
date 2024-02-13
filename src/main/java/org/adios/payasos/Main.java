package org.adios.payasos;

import org.adios.payasos.controller.Dispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.invoke();
    }
}