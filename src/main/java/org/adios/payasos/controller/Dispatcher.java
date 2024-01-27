package org.adios.payasos.controller;

import org.adios.payasos.entity.Person;
import org.adios.payasos.service.ConsoleService;
import org.adios.payasos.service.MassagesServise;
import org.adios.payasos.service.PersonService;

import java.util.List;
import java.util.Scanner;


public class Dispatcher {
    Scanner scanner = new Scanner(System.in);
    PersonService personService = new PersonService();
    ConsoleService consoleService = new ConsoleService();
    MassagesServise massagesServise = new MassagesServise();

    public void invoke() {
        while (true) {
            String switchButton1 = scanner.nextLine().toLowerCase();

            switch (switchButton1) {
                case "create":
                    boolean switchButton = false;
                    if (switchButton == true) {
                        consoleService.setPlayerNickname();
                        consoleService.setPlayerLogin();
                        consoleService.setPlayerPasword();
                    }

                    Person person = personService.createPersonFromConstructor("чики", "бамбони", "залупа");
                    Person person1 = personService.createPersonFromSetters();
                    Person person2 = personService.randomPersonGenerator();
                    List<Person> fakePersonsforList = personService.createFakePersonsforList();
                    personService.printPersonList(fakePersonsforList);
                    System.out.println("\n\n");
                    break;
                case "addmsg":
                    massagesServise.addPersonMassege(personService.getPersons());
                    break;
                case "read":
                    massagesServise.readPersonMassages(personService.getPersons());
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
