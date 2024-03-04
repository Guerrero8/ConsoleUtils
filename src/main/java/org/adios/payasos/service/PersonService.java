package org.adios.payasos.service;

import lombok.Data;
import org.adios.payasos.entity.Person;
import org.adios.payasos.repository.PersonRepository;
import org.adios.payasos.storage.PersonStorage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Data
@Service
public class PersonService {
    Scanner scanner;
    List<Person> persons = PersonStorage.getPersons();
    PersonRepository personRepository;
    CreateFakeFieldServise createFakeFieldServise = new CreateFakeFieldServise();
    public List<Person> createFakePersons() {
        for (int i = 1; i <= 10; i++) {
            Person person = new Person();
            person.setFirstName(createFakeFieldServise.createFakeField());
            person.setLastName(createFakeFieldServise.createFakeField());
            person.setLogin(createFakeFieldServise.createFakeField());
            persons.add(person);
        }
        return persons;
    }
    public Person createFakePerson() {
        Person person = new Person();
        person.setFirstName(createFakeFieldServise.createFakeField());
        person.setLastName(createFakeFieldServise.createFakeField());
        person.setLogin(createFakeFieldServise.createFakeField());
        return person;
    }

    public void printPersonList(List<Person> persons) {
        persons.forEach(person -> {
            System.out.println(person.toString());
        });
    }
}
