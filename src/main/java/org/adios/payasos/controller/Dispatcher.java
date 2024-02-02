package org.adios.payasos.controller;

import org.adios.payasos.entity.Person;
import org.adios.payasos.fileRecord.JsonFileRecord;
import org.adios.payasos.service.SetPresonService;
import org.adios.payasos.service.MassagesServise;
import org.adios.payasos.service.PersonService;
import org.adios.payasos.storage.PersonStorage;

import java.util.List;
import java.util.Scanner;


public class Dispatcher {
    private final Scanner scanner = new Scanner(System.in);
    private final PersonService personService = new PersonService();
    private final SetPresonService setPresonService = new SetPresonService();
    private final MassagesServise messagesServise = new MassagesServise();
    private final List<Person> persons = PersonStorage.getPersons();
    private final JsonFileRecord jsonFileRecord = new JsonFileRecord();
    public void invoke() {
        while (true) {
            jsonFileRecord.jsonRecord(persons);
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
                    messagesServise.addPersonMessege(persons);
                    break;
                case "readallmessage":
                    messagesServise.readAllMessages(persons);
                    break;
                case "raedmessage":
                    messagesServise.readSpecificMessage(persons);
                    break;
                case "deletemessage":
                    messagesServise.deleteSpecificMassage(persons);
                    break;
                case "exit":
                    return;
            }
        }
    }
}
