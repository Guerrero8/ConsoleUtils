package org.adios.payasos;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;


@Getter
@Setter
public class Person {

    private String firstName;
    private String lastName;
    private String login;

    public Person(String firstName, String lastName, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }

    public Person() {

    }

    public static Person createPerson(String firstName, String lastName, String login) {
        return new Person(firstName, lastName, login);
    }

    public static Person createPerson1() {
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

    public static Person createPerson2() {
        Person person = new Person();
        person.setFirstName(createFakeField());
        person.setLastName(createFakeField());
        person.setLogin(createFakeField());
        return person;
    }

}

