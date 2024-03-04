package org.adios.payasos.controller;


import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.adios.payasos.entity.Person;
import org.adios.payasos.repository.PersonRepository;
import org.adios.payasos.service.PersonService;
import org.adios.payasos.storage.PersonStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class PersonController {

    private final PersonService personService;

    private final PersonRepository personRepository;
    List<Person> persons = PersonStorage.getPersons();
    @GetMapping("/createPersons")
    public List<Person> createPersons(){
        personService.createFakePersons();
        return PersonStorage.getPersons();
    }
    @DeleteMapping("/deletePerson/{firstName}")
    public List<Person> deletePerson(@PathVariable String firstName) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getFirstName().toString().equals(firstName)) {
                persons.remove(i);
            }
        }
        return PersonStorage.getPersons();
    }
    @GetMapping("/createPersonFotRepository")
    public void addPersonToRepository() {
        personRepository.save(personService.createFakePerson());
    }
}
