package org.adios.payasos.service;

import lombok.RequiredArgsConstructor;
import org.adios.payasos.repository.PersonRepository;
import org.springframework.stereotype.Service;

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
}
