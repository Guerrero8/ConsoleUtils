package org.AdiosPayasos;

public class Dispatcher {
    public static void invoke(){
        ConsoleUtils consoleUtils = new ConsoleUtils();
        ConsoleUtils.setPlayerNickname();
        ConsoleUtils.setPlayerLogin();
        ConsoleUtils.setPlayerPasword();
    }
}
