package org.adios.payasos.controller;

import org.adios.payasos.entity.Person;
import org.adios.payasos.file.writing.FileServise;
import org.adios.payasos.service.SetPresonService;
import org.adios.payasos.service.MassagesServise;
import org.adios.payasos.service.PersonService;

import java.util.List;
import java.util.Scanner;


public class Dispatcher {
    private final Scanner scanner = new Scanner(System.in);
    private final PersonService personService = new PersonService();
    private final SetPresonService setPresonService = new SetPresonService();
    private final MassagesServise messagesServise = new MassagesServise();
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
                    List<Person> fakePersonsforList = personService.createFakePersonsforList();
                    personService.printPersonList(fakePersonsforList);
                    System.out.println("\n\n");
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
                    fileServise.jsonReader();
                    break;
                case "exit":
                    return;
            }
        }
    }
}
