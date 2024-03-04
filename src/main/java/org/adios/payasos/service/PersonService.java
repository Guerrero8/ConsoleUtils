package org.adios.payasos.service;

import lombok.RequiredArgsConstructor;
import org.adios.payasos.entity.Person;
import org.adios.payasos.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final CreatePersonService createPersonService;
    public void createFakePerson(int numberOfIteration) {
        personRepository.saveAll(createPersonService.createFakePerson(numberOfIteration));
    }
    public void deletePersonByFirstname(String firstName){
        personRepository.deletePersonByFirstName(firstName);
    }
    public List<Person> getPersonFromRepository(String nameForSearch) {
        List<Person> matchedPersons = new ArrayList<>();
        List<Person> allPersons = personRepository.findAll();
        for (Person person : allPersons) {
            if (person.getFirstName().contains(nameForSearch)) {
                matchedPersons.add(person);
            }
        }
        return matchedPersons;
    }
}
