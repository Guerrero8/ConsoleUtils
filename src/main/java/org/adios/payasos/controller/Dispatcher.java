package org.adios.payasos.controller;

import org.adios.payasos.file.writing.FileServise;
import org.adios.payasos.service.MessagesServise;
import org.adios.payasos.service.PersonService;
import org.adios.payasos.service.SetPresonService;

import java.util.Scanner;


public class Dispatcher {
    private final Scanner scanner = new Scanner(System.in);
    private final PersonService personService = new PersonService();
    private final SetPresonService setPresonService = new SetPresonService();
    private final MessagesServise messagesServise = new MessagesServise();
    private final FileServise fileServise = new FileServise();
    public void invoke() {
        while (true) {
            String switchButton0 = scanner.nextLine().toLowerCase();

            switch (switchButton0) {
                case "create":
                    boolean switchButton1 = false;
                    if (switchButton1 == true) {
                        setPresonService.setPlayerNickname();
                        setPresonService.setPlayerLogin();
                        setPresonService.setPlayerPasword();
                    }
                    personService.createFakePersonsforList();
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
