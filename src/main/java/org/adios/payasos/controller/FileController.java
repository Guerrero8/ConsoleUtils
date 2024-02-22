package org.adios.payasos.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.SneakyThrows;
import org.adios.payasos.entity.Person;
import org.adios.payasos.storage.PersonStorage;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("api")
public class FileController {
    List<Person> persons = PersonStorage.getPersons();
    @GetMapping("/download")
    public ResponseEntity<Resource> fileController(){
        File file  = createFile();
        setupFile();
        Resource resource = new FileSystemResource(file);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getName() + "\"")
                .body(resource);
    }
    @SneakyThrows
    public void setupFile(){
        FileWriter fileWriter = new FileWriter(createFile(), false);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(persons.toArray(), fileWriter);
        fileWriter.close();
    }
    @SneakyThrows
    public File createFile(){
        File file = new File("fileWithPersons.json");
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }
}
