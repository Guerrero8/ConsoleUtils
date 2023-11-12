package org.adios.payasos.service;

import lombok.Getter;
import lombok.Setter;


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



}

