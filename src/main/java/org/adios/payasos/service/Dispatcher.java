package org.adios.payasos.service;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Dispatcher {
    Scanner scanner = new Scanner(System.in);
    ConsoleService consoleService = new ConsoleService();

    public void invoke() {

        boolean switchButton = false;

        try {
            System.out.println("true или falce сука ты?");
            switchButton = scanner.nextBoolean();
        } catch (Exception exception) {
            System.out.println("нахуй иди, дибил");
            switchButton = false;
        }

        if (switchButton == true) {
            consoleService.playerNickname();
            consoleService.playerLogin();
            consoleService.playerPasword();
        } else if (switchButton == false) {

        }
        Person person = PersonService.createPersonFromConstructor("чики", "бамбони", "залупа");
        Person person1 = PersonService.createPersonFromSetters();
        Person person2 = PersonService.createPersonFromRandom();
    }
}
