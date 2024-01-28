package org.adios.payasos.service;

import org.adios.payasos.entity.Person;

import java.util.List;
import java.util.Scanner;

public class MassagesServise {
    Scanner scanner = new Scanner(System.in);

    public void addPersonMassege(List<Person> persons) {
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
                    person.getMasseges().add(message);
                    System.out.println("Сообщение успешно добавлено для пользователя " + person.getFirstName() + person.getMasseges());
                    break;
                }
            }
            if (!found) {
                System.out.println("Пользователь с именем " + desiredPerson + " не найден.");
            }
        }
    }

    public void readAllMassages(List<Person> persons) {
        {
            for (Person person : persons) {
                System.out.println("FirstName:" + person.getFirstName()
                        + "Lastname:" + person.getLastName()
                        + "Login:" + person.getLogin()
                        + "Massages:" + person.getMasseges());
            }
        }
    }

    public void readSpecificMassage(List<Person> persons) {
        System.out.println("Введите сообщение которое хотите найти.");
        String desiredMassage = scanner.nextLine();
        boolean found = false;
        for (Person person : persons) {
            String personMessage = person.getMasseges().toString();
            if (personMessage.contains(desiredMassage)) {
                System.out.println("Сообщение найдено у " + person.getFirstName().toString() + ": " + personMessage);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Сообщение не найдено.");
        }
    }
}

