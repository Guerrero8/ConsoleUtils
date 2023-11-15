package org.adios.payasos.service;


import org.adios.payasos.service.Dispatcher;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.invoke();

    }
}