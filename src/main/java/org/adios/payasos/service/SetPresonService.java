package org.adios.payasos.service;

import java.util.Scanner;

public class SetPresonService {
    private final Scanner scanner = new Scanner(System.in);

    public void setPlayerNickname() {
        System.out.println("ник дай:\n");
        String nickname = scanner.nextLine();
        System.out.println("ник на:\n" + nickname);
    }

    public void setPlayerLogin() {
        System.out.println("логин дай:\n");
        String login = scanner.nextLine();
        System.out.println("логин на:\n" + login);
    }

    public void setPlayerPasword() {
        System.out.println("пороль дай:\n");
        String pasword = scanner.nextLine();
        System.out.println("пороль на:\n" + pasword);
    }
}