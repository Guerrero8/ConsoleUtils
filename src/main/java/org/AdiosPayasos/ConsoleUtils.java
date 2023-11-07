package org.AdiosPayasos;
import java.util.Scanner;

public class ConsoleUtils {
    Scanner scanner = new Scanner(System.in);
    public void setPlayerNickname() {
        System.out.println("ник дай:\n");
        String nickname = scanner.nextLine();
        System.out.println("ник на:\n" + nickname);
    }
    public void setPlayerLogin() {
        System.out.println("логин дай:\n");
        String nickname = scanner.nextLine();
        System.out.println("логин на:\n" + nickname);
    }
    public void setPlayerPasword() {
        System.out.println("пороль дай:\n");
        String nickname = scanner.nextLine();
        System.out.println("пороль на:\n" + nickname);
    }

}