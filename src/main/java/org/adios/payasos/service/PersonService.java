package org.adios.payasos.service;

import org.adios.payasos.entity.Person;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.adios.payasos.service.CreateFakePersonServise.createFakeField;

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

    public static List<Person> createFakePersonsforList() {
        List<Person> persons = new ArrayList<>();
        Person person = new Person();
        boolean switchButton2 = false;
        for (int i = 1; i <= 500; i++) {
            CreateFakePersonServise createFakePersonServise = new CreateFakePersonServise();
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
    public static void getPersonList(List<Person> personList){
        personList.forEach(person -> {
            System.out.println(person.toString());
        });

    }


    public static Person createPersonFromRandom() {
        Person person = new Person();
        person.setFirstName(createFakeField());
        person.setLastName(createFakeField());
        person.setLogin(createFakeField());
        return person;
    }

}
