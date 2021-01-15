package design_error;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wohin möchten Sie mit dem Zug fahren?Berlin?Hamburg?Frankfurt a.M.?");
        switch (scanner.nextLine()){
            case "Berlin": System.out.println("Willkommen in Berlin. Vielen Dank, dass Sie sich für die Deutsche Bahn entschieden haben");
            case "Hamburg": System.out.println("Willkommen in Hamburg. Vielen Dank, dass Sie sich für die Deutsche Bahn entschieden haben");
            case "Frankfurt am Main": System.out.println("Willkommen in Frankfurt am Main. Vielen Dank, dass Sie sich für die Deutsche Bahn entschieden haben");
            default: System.out.println("Diese Ziel existiert nicht!");
        }
    }
}
