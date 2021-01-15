package excercise;

import java.util.Scanner;

public class two {
        String[] ziele = new String[]{"Frankfurt", "HEssen", "Berlin", "Hamburg", "Frankfurt", "Bremen", "münschen", "Cologne", "Bielefeld", "Wolfsburg"};
        double[] preise = new double[]{66.6, 12.34, 99.99, 0.01, 4.20, 5.84, 84.87, 73.93, 9999.99, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen am Ticketautomat. Wo möchten Sie hinfahren? Mögliche Ziele sind:");
        for (int f = 0; f <= ziele.length; f++) {
            System.out.println(f + ". - " + ziele[f]);
        }
        System.out.println("Bitte geben Sie die Zahl des Zieles ein");
        int ziel_nummer = Integer.parseInt(scanner.nextLine());
        System.out.println("Sie möchten also nach " + ziele[ziel_nummer] + " fahren. Wieviel Personnen fahren mit?");
        int personen_anzahl = Integer.parseInt(scanner.nextLine());
        double preis = preise[ziel_nummer] / personen_anzahl;
        System.out.println("Bahncard?");
        if (scanner.nextLine().toUpperCase() == "ja") {
            preis *= 1.25;
        }
        System.out.println("Das Ticket kostet pro Person " + (preis / personen_anzahl) + " €");
        double bezahlt = 0;
        do {
            System.out.println("Bitte geben Sie die Münze/den Schein ein die/den sie einwerfen (in euro). Es wird kein Rückgeld ausgezahlt! Es fehlen noch: " + (preis - bezahlt));
            bezahlt + Double.parseDouble(scanner.nextLine());
        } while (preis - bezahlt > 0)
        System.out.println("Hier ihr Ticket!");
}
