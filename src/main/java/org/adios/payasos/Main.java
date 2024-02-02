package org.adios.payasos;

import org.adios.payasos.controller.Dispatcher;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.invoke();

    }
}