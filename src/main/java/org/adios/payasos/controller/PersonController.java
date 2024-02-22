package org.adios.payasos.controller;


import lombok.RequiredArgsConstructor;
import org.adios.payasos.controller.request.DeletePersonRequest;
import org.adios.payasos.entity.Person;
import org.adios.payasos.service.PersonService;
import org.adios.payasos.storage.PersonStorage;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class PersonController {

    private final PersonService personService;
    List<Person> persons = PersonStorage.getPersons();
    @GetMapping("/createPersons")
    public List<Person> createPersons(){
        personService.createFakePersonsforList();
        return PersonStorage.getPersons();
    }
    @PostMapping("/deletePerson")
    public List<Person> deletePerson(@RequestBody DeletePersonRequest deletePersonRequest) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getFirstName().toString().equals(deletePersonRequest.getFirstName())) {
                persons.remove(i);
            }
        }
        return PersonStorage.getPersons();
    }
}
