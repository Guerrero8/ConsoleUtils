package org.adios.payasos.file.writing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import lombok.SneakyThrows;
import org.adios.payasos.entity.Person;
import org.adios.payasos.storage.PersonStorage;

import java.io.*;
import java.util.List;

public class FileServise {
    private final List<Person> persons = PersonStorage.getPersons();

    @SneakyThrows
    public void jsonReader() {
        JsonParser jsonParser = new JsonParser();
        FileReader fileReader = new FileReader("fileForPersons.json");
        String jsonString = jsonParser.parse(fileReader).toString();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonString);
        persons.clear();
        for (JsonNode userNode : jsonNode) {
            String firstName = userNode.get("firstName").asText();
            String lastName = userNode.get("lastName").asText();
            String login = userNode.get("login").asText();
            Person person = new Person();
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setLogin(login);
            persons.add(person);
        }
    }


    @SneakyThrows
    public void jsonRecord() {
        FileWriter fileWriter = new FileWriter(createJsonFile(), false);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(persons.toArray(), fileWriter);
        fileWriter.close();
    }

    @SneakyThrows
    public File createJsonFile() {
        File jsonFile = new File("fileForPersons.json");
        if (!jsonFile.exists()) {
            jsonFile.createNewFile();
        }
        return jsonFile;
    }

    @SneakyThrows
    public void txtRecord() {
        PrintWriter fileWriter = new PrintWriter(createTxtFile());
        for (Person person : persons) {
            fileWriter.println(person);
        }
        fileWriter.close();
    }

    @SneakyThrows
    public File createTxtFile() {
        File txtFile = new File("fileForPersons.txt");
        if (!txtFile.exists()) {
            txtFile.createNewFile();
        }
        return txtFile;
    }
}