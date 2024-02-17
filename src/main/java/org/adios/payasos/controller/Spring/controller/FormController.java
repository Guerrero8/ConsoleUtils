package org.adios.payasos.controller.Spring.controller;


import org.adios.payasos.entity.Person;
import org.adios.payasos.service.MessagesServise;
import org.adios.payasos.service.PersonService;
import org.adios.payasos.storage.PersonStorage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class FormController {
    PersonService personService = new PersonService();
    MessagesServise messagesServise = new MessagesServise();
    @GetMapping
    public String home(){
        return "Form";
    }
    @GetMapping("/returnPersons")
    public List<Person> viewPersons(){
        return PersonStorage.getPersons();
    }
    @ResponseBody
    @GetMapping("/createPersons")
    public List<Person> createPersons(){
        personService.createFakePersonsforList();
        return PersonStorage.getPersons();
    }
    @ResponseBody
    @GetMapping("/addMessege")
    public List<Person> addMessage(){
        messagesServise.addPersonMessege();
        return PersonStorage.getPersons();
    }

}
