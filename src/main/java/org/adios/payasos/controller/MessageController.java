package org.adios.payasos.controller;

import org.adios.payasos.controller.request.CreateMessageRequest;
import org.adios.payasos.controller.request.FindPersonOnMessageRequest;
import org.adios.payasos.entity.Person;
import org.adios.payasos.storage.PersonStorage;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api")
public class MessageController {
    List<Person> persons = PersonStorage.getPersons();

    @PostMapping("/addMessage")
    public List<Person> addMessage(@RequestParam("firstName") String firstName, @RequestParam("message") String message) {
        for (Person person : persons) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                person.getMesseges().add(message);
                break;
            }
        }
        return PersonStorage.getPersons();
    }

    @PostMapping
    public List<Person> findPersonsOnMessage(@RequestBody FindPersonOnMessageRequest findPersonOnMessageRequest) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMesseges().toString().contains(findPersonOnMessageRequest.getMessage())) {
                result.add(person);
            }
        }
        return result;
    }

    @DeleteMapping("/deleteMessage")
    public List<Person> deleteMessage(@RequestBody CreateMessageRequest createMessageRequest) {
        persons.forEach(person -> person.getMesseges().removeIf(message -> message.equals(createMessageRequest.getMessage())));
        return PersonStorage.getPersons();
    }
}
