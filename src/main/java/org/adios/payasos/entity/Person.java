package org.adios.payasos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private String login;
    List<String> messeges = new ArrayList<>();

    public Person(String name, String firstName, String lastName, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }
}

