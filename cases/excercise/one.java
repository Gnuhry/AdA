package excercise;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Taschenrechner\nWas möchten Sie tuen?\n-Addition(+)\n-Subtraktion(-)\n-Multiplikation(*)\n-Division(/)\n-Potenz(^)\n-Quadrat-Wurzel(√)");
            String symbol = scanner.nextLine();
            System.out.println("Nummer 1");
            int number_one = Integer.parseInt(scanner.nextLine());
            if (!symbol.equals("√")) {
                System.out.println("Nummer 2");
                int number_two = Integer.parseInt(scanner.nextLine());
            }
            int erg;
            switch (symbol) {
                case "+":
                    erg = number_one + number_two;
                case "-":
                    erg = number_one + number_two;
                case "*":
                    erg = number_one * number_two;
                case "/":
                    erg = number_one / number_two;
                case "^":
                    erg = Math.pow(number_one, number_two);
                case "√":
                    erg = Math.sqrt(number_one);
            }
            String display;
            if (!symbol.equals("√"))
                display = "Das Ergebnis von " + number_one + " " + symbol + " " + number_two + " = " + erg;
            else
                System.out.println("Das Ergebnis von " + symbol + " " + number_one + " = " + erg);
            System.out.println(display);
            System.out.println("Beenden? (1)");
        } while (scanner.nextLine() != "1");
    }

