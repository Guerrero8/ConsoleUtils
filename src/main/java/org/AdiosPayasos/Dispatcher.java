package org.AdiosPayasos;

public class Dispatcher {

    ConsoleUtils consoleUtils = new ConsoleUtils();
    public void invoke(){
        consoleUtils.setPlayerNickname();
        consoleUtils.setPlayerLogin();
        consoleUtils.setPlayerPasword();
    }
}
