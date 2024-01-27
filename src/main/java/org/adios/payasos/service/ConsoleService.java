package org.adios.payasos.service;

import org.adios.payasos.entity.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleService {
    private final Scanner scanner = new Scanner(System.in);

    public void setPlayerNickname() {
        System.out.println("ник дай:\n");
        String nickname = scanner.nextLine();
        System.out.println("ник на:\n" + nickname);
    }

    public void setPlayerLogin() {
        System.out.println("логин дай:\n");
        String login = scanner.nextLine();
        System.out.println("логин на:\n" + login);
    }

    public void setPlayerPasword() {
        System.out.println("пороль дай:\n");
        String pasword = scanner.nextLine();
        System.out.println("пороль на:\n" + pasword);
    }

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
}
