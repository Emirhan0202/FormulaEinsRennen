/**
 * Autor: Emirhan Bekmez
 * Date: 30.03.2022
 * Version: 0.1
 */


public class Rennauto {

    public String Fahrer; // Erstellen der Variable Fahrer
    public int Kennnummer;  // Erstellen der Variable Kennnumer
    public String Rennstall; // Erstellen der Variable Rennstall
    public double avgTime; // Erstellen der Variable avgTime

    // Erstellen einer Konstruktors
    public Rennauto(String Fahrer, int Kennnummer, String Rennstall, double avgTime) {
        // this. macht das der Variable Fahrer, Kennnummer, Rennstall der Klasse Rennauto gleich dem über gegebene Parameter ist
        this.Fahrer = Fahrer;
        this.Kennnummer = Kennnummer;
        this.Rennstall = Rennstall;
        this.avgTime = avgTime;
    }

    // Erstellen einer Methode für die Ausgabe der Fahrer name und eigenschaften
    public void getDriverDetail() {
        System.out.println("Der Fahrer: " + Fahrer + ", mit dem Kennnummer " + Kennnummer + ", in dem Team " + Rennstall + " mit der Durchschnitt zeit pro Runde " + avgTime + "sec");
    }
}




