package org.adios.payasos.controller;

import org.adios.payasos.entity.Person;
import org.adios.payasos.service.ConsoleService;
import org.adios.payasos.service.PersonService;

import java.util.List;
import java.util.Scanner;


public class Dispatcher {
    Scanner scanner = new Scanner(System.in);
    ConsoleService consoleService = new ConsoleService();

    public void invoke() {
        while (true) {
            System.out.println("Желаете создать пльзователей? \n помощь - help");
            String switchButton1 = scanner.nextLine().toLowerCase();

            switch (switchButton1) {
                case "create":
                    boolean switchButton2 = false;
                    if (switchButton2 == true) {
                        consoleService.playerNickname();
                        consoleService.playerLogin();
                        consoleService.playerPasword();
                    }

                    PersonService personService = new PersonService();
                    Person person = personService.createPersonFromConstructor("чики", "бамбони", "залупа");
                    Person person1 = personService.createPersonFromSetters();
                    Person person2 = personService.createPersonFromRandom();
                    List<Person> fakePersonsforList = personService.createFakePersonsforList();
                    personService.getPersonList(fakePersonsforList);
                    System.out.println("\n\n");
                    break;
                case "exit":
                    return;
                case "help":
                    System.out.println("create - создание пользователей \n" +
                            "exit - выход из программы \n");
            }
        }
    }
}
