package org.adios.payasos.service;

import org.adios.payasos.entity.Person;
import org.adios.payasos.service.ConsoleService;
import org.adios.payasos.service.PersonService;

import java.util.List;
import java.util.Scanner;


public class Dispatcher {
    Scanner scanner = new Scanner(System.in);
    ConsoleService consoleService = new ConsoleService();

    public void invoke() {

        boolean switchButton = false;

        if (switchButton == true) {
            consoleService.playerNickname();
            consoleService.playerLogin();
            consoleService.playerPasword();
        }

        Person person = PersonService.createPersonFromConstructor("чики", "бамбони", "залупа");
        Person person1 = PersonService.createPersonFromSetters();
        Person person2 = PersonService.createPersonFromRandom();
        List<Person> fakePersonsforList = PersonService.createFakePersonsforList();
        PersonService.jfwefniowjf(fakePersonsforList);
    }
}
