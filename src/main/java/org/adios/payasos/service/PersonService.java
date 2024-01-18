package org.adios.payasos.service;

import org.adios.payasos.entity.Person;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PersonService {
    public Person createPersonFromConstructor(String firstName, String lastName, String login) {
        return new Person(firstName, lastName, login);
    }

    public Person createPersonFromSetters() {
        Person person = new Person();
        person.setFirstName("клава");
        person.setLastName("кока");
        person.setLogin("дерижабль");
        return person;
    }

    public List<Person> createFakePersonsforList() {
        List<Person> persons = new ArrayList<>();
        boolean switchButton2 = false;
        CreateFakePersonServise createFakePersonServise = new CreateFakePersonServise();
        for (int i = 1; i <= 500; i++) {
            Person person = new Person();
            person.setFirstName(createFakePersonServise.createFakeField());
            person.setLastName(createFakePersonServise.createFakeField());
            person.setLogin(createFakePersonServise.createFakeField());
            persons.add(person);

            if (switchButton2 == true) {
                System.out.println(person);
            }
        }
        return persons;
    }
    public void getPersonList(List<Person> personList){
        personList.forEach(person -> {
            System.out.println(person.toString());
        });
    }


    public Person createPersonFromRandom() {
        Person person = new Person();
        CreateFakePersonServise createFakePersonServise = new CreateFakePersonServise();
        person.setFirstName(createFakePersonServise.createFakeField());
        person.setLastName(createFakePersonServise.createFakeField());
        person.setLogin(createFakePersonServise.createFakeField());
        return person;
    }

}
