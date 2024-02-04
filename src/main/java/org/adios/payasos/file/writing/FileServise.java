package org.adios.payasos.file.writing;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import liquibase.repackaged.com.opencsv.CSVWriter;
import lombok.SneakyThrows;
import org.adios.payasos.entity.Person;
import org.adios.payasos.storage.PersonStorage;
import java.io.*;
import java.util.List;

public class FileServise {
    private final List<Person> persons = PersonStorage.getPersons();
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

    @SneakyThrows
    public void csvRecord() {
        CSVWriter csvWriter = new CSVWriter(new PrintWriter(createCsvFIle()));
        for (Person person : persons) {
            String[] record = {person.getFirstName(),
                    person.getLastName(),
                    person.getLogin()};
            csvWriter.writeNext(record);
        }
        csvWriter.close();
    }

    @SneakyThrows
    public File createCsvFIle() {
        File csvFile = new File("fileForPersons.csv");
        if (!csvFile.exists()) {
            csvFile.createNewFile();
        }
        return csvFile;
    }
}
