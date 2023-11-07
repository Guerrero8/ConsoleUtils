package org.adios.payasos;


import org.adios.payasos.service.ConsoleService;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        ConsoleService consoleService = new ConsoleService();
       dispatcher.invoke(consoleService);
    }
}