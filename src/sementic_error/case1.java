package sementic_error;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Passwort");
        String s = scanner.nextLine().toUpperCase();
        if (s.equals("password")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    }
}
