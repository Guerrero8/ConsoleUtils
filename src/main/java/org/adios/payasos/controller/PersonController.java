package org.adios.payasos.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.adios.payasos.entity.Person;
import org.adios.payasos.service.PersonService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class PersonController {

    private final PersonService personService;

    @GetMapping("/createPersons")
    public void createPersons(@RequestParam int numberOfIteration) {
        personService.createFakePerson(numberOfIteration);
    }
    @Transactional
    @DeleteMapping("/deletePerson/{firstName}")
    public void deletePerson(@PathVariable String firstName){
        personService.deletePersonByFirstname(firstName);
    }
    @PostMapping("/getPerson/{nameForSearch}")
    public List<Person> getPersonFromRepository(@PathVariable String nameForSearch){
        return personService.getPersonFromRepository(nameForSearch);
    }
}
