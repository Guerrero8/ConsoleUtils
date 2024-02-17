package org.adios.payasos.storage;

import org.adios.payasos.entity.Person;
import java.util.ArrayList;
import java.util.List;


public class PersonStorage {

    private static List<Person> persons = new ArrayList<>(){};
    public static List<Person> getPersons() {
        if (persons == null) {
            persons = new ArrayList<>();
        }

        return persons;
    }
}