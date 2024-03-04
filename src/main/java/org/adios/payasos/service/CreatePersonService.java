package org.adios.payasos.service;

import org.adios.payasos.entity.Person;
import org.adios.payasos.storage.PersonStorage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class CreatePersonService {
    public List<Person> createFakePerson(int numberOfIteration) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < numberOfIteration; i++) {
            Person person = new Person();
            person.setFirstName(createFakeField());
            person.setLastName(createFakeField());
            person.setLogin(createFakeField());
            persons.add(person);
        }
        return persons;
    }
    private String createFakeField(){
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = 8;
        StringBuilder symbolBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            symbolBuilder.append(randomChar);
        }
        return symbolBuilder.toString();
    }
}