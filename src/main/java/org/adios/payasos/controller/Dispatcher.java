package org.adios.payasos.controller;

import org.adios.payasos.entity.Person;
import org.adios.payasos.service.FileRecord;
import org.adios.payasos.service.SetPresonService;
import org.adios.payasos.service.MassagesServise;
import org.adios.payasos.service.PersonService;

import java.util.List;
import java.util.Scanner;


public class Dispatcher {
    Scanner scanner = new Scanner(System.in);
    PersonService personService = new PersonService();
    SetPresonService setPresonService = new SetPresonService();
    MassagesServise messagesServise = new MassagesServise();
    FileRecord fileRecord = new FileRecord();

    public void invoke() {
        while (true) {
            fileRecord.fileRecordPersons(personService.getPersons());
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
                    messagesServise.addPersonMessege(personService.getPersons());
                    break;
                case "readallmessage":
                    messagesServise.readAllMessages(personService.getPersons());
                    break;
                case "raedmessage":
                    messagesServise.readSpecificMessage(personService.getPersons());
                    break;
                case "deletemessage":
                    messagesServise.deleteSpecificMassage(personService.getPersons());
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
