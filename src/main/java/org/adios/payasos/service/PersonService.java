package org.adios.payasos.service;

import org.adios.payasos.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonService {
    Scanner scanner = new Scanner(System.in);
    List<Person> persons = new ArrayList<>();
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
        boolean switchButton2 = false;
        CreateFakeFieldServise createFakeFieldServise = new CreateFakeFieldServise();
        for (int i = 1; i <= 10; i++) {
            Person person = new Person();
            person.setFirstName(createFakeFieldServise.createFakeField());
            person.setLastName(createFakeFieldServise.createFakeField());
            person.setLogin(createFakeFieldServise.createFakeField());
            persons.add(person);

            if (switchButton2 == true) {
                System.out.println(person);
            }
        }
        return persons;
    }
    public List<Person> getPersons() {
        return persons;
    }
    public void printPersonList(List<Person> personList){
        personList.forEach(person -> {
            System.out.println(person.toString());
        });
    }


    public Person randomPersonGenerator() {
        Person person = new Person();
        CreateFakeFieldServise createFakeFieldServise = new CreateFakeFieldServise();
        person.setFirstName(createFakeFieldServise.createFakeField());
        person.setLastName(createFakeFieldServise.createFakeField());
        person.setLogin(createFakeFieldServise.createFakeField());
        return person;
    }
}
