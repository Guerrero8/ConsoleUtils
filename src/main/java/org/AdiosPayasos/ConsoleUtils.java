package org.AdiosPayasos;
import java.util.Scanner;

public class ConsoleUtils {
    public static void setPlayerNickname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ник дай:\n");
        String nickname = scanner.nextLine();
        System.out.println("ник на:\n" + nickname);
    }
    public static void setPlayerLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("логин дай:\n");
        String nickname = scanner.nextLine();
        System.out.println("логин на:\n" + nickname);
    }
    public static void setPlayerPasword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("пороль дай:\n");
        String nickname = scanner.nextLine();
        System.out.println("пороль на:\n" + nickname);
    }

}