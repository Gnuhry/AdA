package excercise;

import java.util.Scanner;

public class two_solution {
    public static void main(String[] args) { //Methode fehlt (syntax error)
        String[] ziele = new String[]{"Frankfurt am Main", "Essen", "Berlin", "Hamburg", "Frankfurt an der Oder", "Bremen", "München", "Köln", "Bielefeld", "Wolfsburg"}; //falsche Angaben (design error)
        double[] preise = new double[]{66.6, 12.34, 99.99, 0.01, 4.20, 5.84, 84.87, 73.93, 9999.99, 0.0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen am Ticketautomat. Wo möchten Sie hinfahren? Mögliche Ziele sind:");
        for (int f = 0; f < ziele.length; f++) { //array index auf das 10te element nicht möglich (runtime exception error)
            System.out.println(f + ". - " + ziele[f]);
        }
        System.out.println("Bitte geben Sie die Zahl des Zieles ein");
        int ziel_nummer;
        try {
            ziel_nummer = Integer.parseInt(scanner.nextLine()); //check ob eingabe eine zahl ist (runtime exception error)
        } catch (NumberFormatException ignored) {
            System.out.println("Eingabe ist keine Zahl");
            return;
        }
        if (ziel_nummer >= ziele.length) { //abfangen der zahl als index für array(runtime exception error)
            System.out.println("Eingabe ist keine mögliche Zahl");
            return;
        }
        System.out.println("Sie möchten also nach " + ziele[ziel_nummer] + " fahren. Wieviel Personnen fahren mit?");
        int personen_anzahl;
        try {
            personen_anzahl = Integer.parseInt(scanner.nextLine()); //check ob eingabe eine zahl ist (runtime exception error)
        } catch (NumberFormatException ignored) {
            System.out.println("Eingabe ist keine Zahl");
            return;
        }
        if (personen_anzahl <= 0) { //Abfangen von negativen zahlen und null (runtime exception error & logic error)
            System.out.println("Personnen können nicht weniger als 1 sein");
            return;
        }
        double preis = preise[ziel_nummer] * personen_anzahl; //um den preis zu ermitteln muss man mal die personnen rechnen (logic error)
        System.out.println("Bahncard?");
        if (scanner.nextLine().toLowerCase().equals("ja")) { //!= kann nicht Strings vergleichen (semantic error & logic error) || falsche Methode verwendet (semantic error)
            preis *= 0.75; //falsche formel (logic error)
        }
        System.out.println("Das Ticket kostet pro Person " + (preis / personen_anzahl) + " €");
        double bezahlt = 0;
        do {
            System.out.println("Bitte geben Sie die Münze/den Schein ein die/den sie einwerfen (in euro). Es wird kein Rückgeld ausgezahlt! Es fehlen noch: " + (preis - bezahlt));
            double muenze;
            try {
                muenze = Double.parseDouble(scanner.nextLine()); //check ob eingabe eine zahl ist (runtime exception error)
            } catch (NumberFormatException ignored) {
                System.out.println("Eingabe ist keine Zahl");
                return;
            }
            if (muenze == 0.1 || muenze == 0.2 || muenze == 0.5 || muenze == 1 || muenze == 2 || muenze == 5 || muenze == 10 || muenze == 20 || muenze == 50) //checken ob münze oder existiert (logic error)
                bezahlt += muenze; //keine aussage (syntax error & runtime exception error)
            else
                System.out.println("Diese Münze/Den Schein nehmen wir leider nicht an!");
        } while (preis - bezahlt > 0); //semikolon fehlt (syntax error)
        System.out.println("Hier ihr Ticket!");
    }
}
