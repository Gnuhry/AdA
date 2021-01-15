package logic_error;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Flächeninhalt eines Kreises ausrechnen\nBitte gib den Radius ein (cm, Ganzzahl)");
        String input = scanner.nextLine();
        int radius;
        try {
            radius = Integer.parseInt(input);
        } catch (NumberFormatException ignored) {
            System.out.println("Eingabe ist keine Zahl");
            return;
        }
        double area = 0.5f * Math.PI * radius * radius;
        System.out.println("Der Flächeninhalt des Kreises mit dem Radius " + radius + " cm beträgt " + area + " cm²");

    }
}
