package org.adios.payasos;

import org.adios.payasos.service.ConsoleService;

public class Dispatcher {

    public void invoke(ConsoleService consoleService){
        consoleService.playerNickname();
        consoleService.playerLogin();
        consoleService.playerPasword();
    }
}
