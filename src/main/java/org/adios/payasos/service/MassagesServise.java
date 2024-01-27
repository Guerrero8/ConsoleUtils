package org.adios.payasos.service;

import org.adios.payasos.entity.Person;

import java.util.List;

public class MassagesServise {
    public void readPersonMassages(List<Person> persons) {
        {
            for (Person person : persons) {
                System.out.println("FirstName:" + person.getFirstName()
                        + "Lastname:" + person.getLastName()
                        + "Login:" + person.getLogin()
                        + "Massages:" + person.getMasseges());
            }
        }
    }
}
