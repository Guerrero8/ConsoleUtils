package org.adios.payasos.service;

import org.adios.payasos.entity.Person;
import org.adios.payasos.storage.PersonStorage;

import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

public class MessagesServise {

    Scanner scanner = new Scanner(System.in);

    private final List<Person> persons = PersonStorage.getPersons();

    public void addPersonMessege() {
        if (persons.isEmpty()) {
            System.out.println("Вы еще не создали пользователей, так что вам некому добавить сообщение.");
        } else {
            for (Person person : persons) {
                System.out.println(person.getFirstName());
            }
            System.out.println("Выберете пользователя из списка.");
            String desiredPerson = scanner.nextLine();
            boolean found = false;
            for (Person person : persons) {
                if (person.getFirstName().equalsIgnoreCase(desiredPerson)) {
                    found = true;
                    System.out.println("Введите новое сообщение для пользователя " + person.getFirstName());
                    String message = scanner.nextLine();
                    person.getMesseges().add(message);
                    System.out.println("Сообщение успешно добавлено для пользователя " + person.getFirstName() + person.getMesseges());
                    break;
                }
            }
            if (!found) {
                System.out.println("Пользователь с именем " + desiredPerson + " не найден.");
            }
        }
    }

    public void readAllMessages() {
        {
            for (Person person : persons) {
                System.out.println("FirstName:" + person.getFirstName()
                        + "Lastname:" + person.getLastName()
                        + "Login:" + person.getLogin()
                        + "Massages:" + person.getMesseges());
            }
        }
    }

    public void readSpecificMessage() {
        System.out.println("Введите сообщение которое хотите найти.");
        String desiredMessage = scanner.nextLine();
        int foundCount = 0;
        for (Person person : persons) {
            String personMessage = person.getMesseges().toString();
            if (personMessage.contains(desiredMessage)) {
                String pattern = "Сообщение найдено у  %s: %s";
                System.out.println(format(pattern, person.getFirstName(), personMessage));

                System.out.println("Сообщение найдено у "
                        + person.getFirstName().toString()
                        + ": "
                        + personMessage);
                foundCount++;
            }
        }

        if (foundCount == 0) {
            System.out.println("Сообщение не найдено.");
        }
    }
    public void deleteSpecificMassage() {
        System.out.println("Введите сообщение которое хотите удалить.");
        String deletedMessage = scanner.nextLine();
        for (Person person : persons) {
            for (int i = 0; i < person.getMesseges().size(); i++) {
                if (person.getMesseges().get(i).equals(deletedMessage)) {
                    person.getMesseges().remove(i);
                }
            }
        }
    }
}


