package org.adios.payasos.controller;

import org.adios.payasos.file.writing.FileServise;
import org.adios.payasos.service.MessagesServise;
import org.adios.payasos.service.PersonService;

import java.util.Scanner;


public class Dispatcher {
    private final Scanner scanner = new Scanner(System.in);
    private final PersonService personService = new PersonService();
    private final MessagesServise messagesServise = new MessagesServise();
    private final FileServise fileServise = new FileServise();
    public void invoke() {
        while (true) {
            String switchButton0 = scanner.nextLine().toLowerCase();

            switch (switchButton0) {
                case "create":
                    personService.createFakePersons();
                    break;
                case "addmessage":
                    messagesServise.addPersonMessege();
                    break;
                case "readallmessage":
                    messagesServise.readAllMessages();
                    break;
                case "raedmessage":
                    messagesServise.readSpecificMessage();
                    break;
                case "deletemessage":
                    messagesServise.deleteSpecificMassage();
                    break;
                case "json":
                    fileServise.jsonRecord();
                    break;
                case "exit":
                    return;
            }
        }
    }
}
