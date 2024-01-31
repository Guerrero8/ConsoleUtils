package org.adios.payasos.service;

import lombok.SneakyThrows;
import org.adios.payasos.entity.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileRecord {
    @SneakyThrows
    public File createTxtFile() {
        File fileForPersons = new File("fileForPersons.txt");
        if (!fileForPersons.exists()) {
            fileForPersons.createNewFile();
        }
        return fileForPersons;
    }

    @SneakyThrows
    public void fileRecordPersons(List<Person> persons) {

        PrintWriter fileWriter = new PrintWriter(createTxtFile());
        for (Person person : persons) {
            fileWriter.println(person);
        }
        fileWriter.close();
    }
}





