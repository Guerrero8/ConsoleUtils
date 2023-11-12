package org.adios.payasos.service;

import java.util.Random;

public class PersonService {
    public static Person createPersonFromConstructor(String firstName, String lastName, String login) {
        return new Person(firstName, lastName, login);
    }

    public static Person createPersonFromSetters() {
        Person person = new Person();
        person.setFirstName("клава");
        person.setLastName("кока");
        person.setLogin("дережабль");
        return person;
    }

    public static String createFakeField() {
        Random random = new Random();
        Integer nextInt = random.nextInt();
        return nextInt.toString();
    }

    public static Person createPersonFromRandom() {
        Person person = new Person();
        person.setFirstName(createFakeField());
        person.setLastName(createFakeField());
        person.setLogin(createFakeField());
        return person;
    }
}
