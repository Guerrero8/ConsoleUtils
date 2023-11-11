package org.adios.payasos;

import org.adios.payasos.service.ConsoleService;

import java.util.Scanner;

public class Dispatcher {
    Scanner scanner = new Scanner(System.in);
    ConsoleService consoleService = new ConsoleService();
    public void invoke(){
        boolean switchButton = false;

        if (switchButton == true){
            consoleService.playerNickname();
            consoleService.playerLogin();
            consoleService.playerPasword();
        }
        else if (switchButton == false){

        }
       Person person = Person.createPerson("чики", "бамбони", "залупа");
       Person person1 = Person.createPerson1();
       Person person2 = Person.createPerson2();
    }
}
