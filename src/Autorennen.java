/**
 * Autor: Emirhan Bekmez
 * Date: 30.03.2022
 * Version: 0.1
 */

import java.util.Scanner; // Scanner einfügen

public class Autorennen { //Main klasse

    public static void main(String[] args) { // Main Methode
        String i; // Variable für String einlesen

        System.out.println("Wählen sie die Strecke aus: \n| Red Bull Ring    " + " |\n| Monza eni Circuit |\n| Circuit de Monaco |\n"); // Kartenauswahl
        Scanner sc1 = new Scanner(System.in); // Scanner objekt erstellung
        System.out.println("Geben sie die Name des Strecke hier ein:");
        i = sc1.nextLine(); //variable i = in der nächsten Zeile eingelesener String

        /* if anweisung für die auswahl der Karten und deren Methoden und Eigenschaften */
        if (i.equalsIgnoreCase("Red Bull Ring"))
            getGranPrixLength("Red Bull Ring", 71, 4.318);
        else if (i.equalsIgnoreCase("Monza eni Circuit"))
            getGranPrixLength("Monza eni Circuit", 53, 5.793);
        else if (i.equalsIgnoreCase("Circuit de Monaco"))
            getGranPrixLength("Circuit de Monaco", 78, 3.337);
        else {
            System.out.println("Hallo");
            System.out.println("Falscher eingabe");
            System.exit(0); // Beendet das Programm bei falscher Eingabe
        }

        /* Erstellen von neuen auto1 Objekte der Klasse Rennauto und Eigenschaften aus der Konstruktor */
        Rennauto auto1 = new Rennauto("Lewis Hamilton", 44, "Mercedes", 60);
        Rennauto auto2 = new Rennauto("Max Verstappen", 43, "Red Bull", 75);
        Rennauto auto3 = new Rennauto("Daniel Ricciardo", 3, "McLaren", 89);
        Rennauto auto4 = new Rennauto("Sebastian Vettel", 5, "Aston Martin", 61);
        System.out.println("Alle Fahrer im Überblick:");

        // Methoden aufruf der Objekte
        auto1.getDriverDetail();
        auto2.getDriverDetail();
        auto3.getDriverDetail();
        auto4.getDriverDetail();
    }

    /* Erstellen der Methode mit dem Parameter Strecke , rundenanzahl und gesamtstrecke */
    public static void getGranPrixLength(String strecke, int rundenanzahl, double gesamtstrecke) {
        // Gibt die Strecken name und rundenanzahl und die gesamte gefahrene Länge der Rennstrecke an
        System.out.println("\nSie habe die Strecke " + strecke + " ausgewählt");
        System.out.println("Runden die zu fahren sind " + "\"" + rundenanzahl + "\"" + " mit der länge pro Runde von " + gesamtstrecke + "km");
        System.out.println("Somit beträgt die Streckenlänge die zu fahren ist " + rundenanzahl * gesamtstrecke + "km\n");
    }
}



















