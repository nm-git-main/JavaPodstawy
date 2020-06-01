package javaPodstawy.IntroLoops;

import java.util.Scanner;

public class Termometr {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj swoją temperature");
        float temperatura = czytnik.nextFloat();
        if (temperatura >= 36.6) {
            System.out.println("Masz goraczke, musisz się leczyć, ale ...");

        } else {
            System.out.println("Sprawdź ponownie temperaturę lub wyrzuc termometr. Panuje koronawirus wiec sprawdzamy ponownie temperature ;) .");
        }
        System.out.println("Podaj temperature z drugiego pomiaru");
        float temperaturaDwa = czytnik.nextFloat();
        if (temperaturaDwa >= 36.6) {
            System.out.println("Jednak jesteś chory");
        } else {
            System.out.println("Udało się! Jednak nie jesteś chory");

        }


    }


}
