package org.adios.payasos.fileRecord;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import lombok.SneakyThrows;
import org.adios.payasos.entity.Person;

import java.io.File;
import java.io.FileWriter;
import java.util.List;


public class JsonFileRecord {
    Gson gson = new Gson();
    @SneakyThrows
    public File createJsonFile(){
        File jsonFile = new File("fileForPersons.json");
        if (!jsonFile.exists()){
            jsonFile.createNewFile();
        }
        return jsonFile;
    }
    @SneakyThrows
    public void jsonRecord(List<Person> persons){
        createJsonFile();
        Gson gsonbuilder = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter("fileForPersons.json");
        gsonbuilder.toJson(persons, fileWriter);
        fileWriter.close();
    }




}
