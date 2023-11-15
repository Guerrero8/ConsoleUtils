package org.adios.payasos.service;

import org.adios.payasos.entity.Person;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonService {
    public static Person createPersonFromConstructor(String firstName, String lastName, String login) {
        return new Person(firstName, lastName, login);
    }

    public static Person createPersonFromSetters() {
        Person person = new Person();
        person.setFirstName("клава");
        person.setLastName("кока");
        person.setLogin("дерижабль");
        return person;
    }

    public static String createFakeField() {
        Random random = new Random();
        Integer nextInt = random.nextInt();
        return nextInt.toString();
    }

    public static List<Person> createFakePersonsforList() {
        List persons = new ArrayList<>();
        Person person = new Person();
        boolean switchButton2 = false;
        for (int i = 1; i <= 500; i++) {
            person.setFirstName(createFakeField());
            person.setLastName(createFakeField());
            person.setLogin(createFakeField());
            persons.add(person);

            if (switchButton2 == true) {
                System.out.println(person);
            }
        }
        return persons;
    }


    public static Person createPersonFromRandom() {
        Person person = new Person();
        person.setFirstName(createFakeField());
        person.setLastName(createFakeField());
        person.setLogin(createFakeField());
        return person;
    }

}
