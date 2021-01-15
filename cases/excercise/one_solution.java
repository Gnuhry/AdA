package excercise;

import java.util.Scanner;

public class one_solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Taschenrechner\nWas möchten Sie tuen?\n-Addition(+)\n-Subtraktion(-)\n-Multiplikation(*)\n-Division(/)\n-Potenz(^)\n-Quadrat-Wurzel(sqrt)"); //√ kann der User nicht eingeben (design error)
            String symbol = scanner.nextLine();
            int number_one, number_two = 0; //number_two war nur im if scope sichtbar (Syntax Fehler)
            System.out.println("Nummer 1");
            try {
                number_one = Integer.parseInt(scanner.nextLine()); //Checken ob die Eingabe ein integer ist (runtime exception error)
            } catch (NumberFormatException ignored) {
                System.out.println("Eingabe ist keine Nummer");
                return;
            }
            if (!symbol.equals("sqrt")) {
                System.out.println("Nummer 2");
                try {
                    number_two = Integer.parseInt(scanner.nextLine()); //Checken ob die Eingabe ein integer ist (runtime exception error)
                } catch (NumberFormatException ignored) {
                    System.out.println("Eingabe ist keine Nummer");
                    return;
                }
            }
            double erg; //ergebnise können auch Kommazahlen enthalten (syntax error)
            switch (symbol) {
                case "+":
                    erg = number_one + number_two;
                    break; //ohne break geht er in alle cases hinein (logic error)
                case "-":
                    erg = number_one - number_two;
                    break;//Falscher Algorithmus (logic error)
                case "*":
                    erg = number_one * number_two;
                    break;
                case "/":
                    if (number_two == 0) { //Abfangen von Division durch 0 (runtime exception error)
                        System.out.println("Division durch Null ist nicht erlaubt");
                        return;
                    }
                    erg = ((double) number_one) / number_two;
                    break;//cast auf double, da die division auch Kommazahlen ausgibt (logic error)
                case "^":
                    erg = Math.pow(number_one, number_two);
                    break;
                case "sqrt": //s.o. (design error)
                    if (number_one < 0) { //Abfangen von negativen Zahlen (runtime exception error)
                        System.out.println("Wurzel ziehen von negativen Zahlen ist nicht möglich");
                        return;
                    }
                    erg = Math.sqrt(number_one);
                    break;
                default:
                    System.out.println("Falsche Symbol Eingabe"); //Abfangen von falschen Eingaben (runtime exceptin error)
                    return;
            }
            String display;
            if (!symbol.equals("sqrt"))
                display = "Das Ergebnis von " + number_one + " " + symbol + " " + number_two + " = " + erg;
            else
                display = "Das Ergebnis von " + symbol + " " + number_one + " = " + erg; //display muss initalisiert werden (runtime exception error)
            System.out.println(display);
            System.out.println("Beenden? (1)");
        } while (!scanner.nextLine().equals("1")); //endloschleife (runtime exception error & sementic error)
    }
} //Klammer fehlt (syntax error)

