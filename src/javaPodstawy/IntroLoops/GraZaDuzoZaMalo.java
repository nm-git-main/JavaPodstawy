package javaPodstawy.IntroLoops;

import java.util.Random;
import java.util.Scanner;

public class GraZaDuzoZaMalo {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Wylosowalem liczbe z zakresu 0-100. Sprobuj zgadnac");

        int losowaLiczba = rand.nextInt(101);
        System.out.println(losowaLiczba);

        //petla ma sie wykonywac tak dlugo az ktos zgadnie

        //1 opcja nieskonczony while
        int liczbaUzytkownika = -1;
        // dodatkowo definiujemy licznik
        int licznik = 0;

        while (true) {
            liczbaUzytkownika = czytnik.nextInt();
            //dodatkowo licznik wpisujemy zeby wiedzieć w ilu próbach, przed wejsciem
            // do petli ustawiam go na zero a potem jak uzytwkonik cos robi to ++
            licznik++;
            if (liczbaUzytkownika == losowaLiczba) {
                System.out.println("Wow Gratulacje! Dobry strzal. Udało się za  "+ licznik+ " razem :D");
                break;
            }
            if (liczbaUzytkownika < losowaLiczba) {
                System.out.println("Podales za mala liczbe");
            } else {
                System.out.println("Podałes za duza liczbe");
            }

        }

        System.out.println("Koniec Gry!");
    }
}