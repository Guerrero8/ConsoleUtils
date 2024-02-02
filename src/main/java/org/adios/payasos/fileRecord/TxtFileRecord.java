package org.adios.payasos.fileRecord;

import lombok.SneakyThrows;
import org.adios.payasos.entity.Person;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

public class TxtFileRecord {
    @SneakyThrows
    public File createTxtFile() {
        File txtFile = new File("txtFile.txt");
        if (!txtFile.exists()) {
            txtFile.createNewFile();
        }
        return txtFile;
    }

    @SneakyThrows
    public void txtRecord(List<Person> persons) {

        PrintWriter fileWriter = new PrintWriter(createTxtFile());
        for (Person person : persons) {
            fileWriter.println(person);
        }
        fileWriter.close();
    }
}





