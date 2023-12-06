package org.adios.payasos.service;

import java.util.*;
import java.util.Random;

import org.adios.payasos.service.Dispatcher;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dispatcher dispatcher = new Dispatcher();
        while (true) {
            System.out.println("Желаете создать пльзователей? \n помощь - help");
            String switchButton = scanner.nextLine().toLowerCase();
            switch (switchButton) {
                case "create":
                    dispatcher.invoke();
                    break;
                case "exit":
                    return;
                case"help":
                    System.out.println("create - создание пользователей \n" +
                            "exit - выход из программы \n");
            }
        }
    }
}