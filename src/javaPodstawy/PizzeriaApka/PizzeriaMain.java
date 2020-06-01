package javaPodstawy.PizzeriaApka;

import java.util.Scanner;

public class PizzeriaMain {
    //to bedzie frontend
    public static void main(String[] args) {
        // metoda main do uruchomienia aplikacji , wypisalismy klasy gdize indziej ale musimy ja wypisac by
        // zaczac aplikacje- zawsze klasy wrzucimy do maina
        Scanner placek = new Scanner(System.in);
        PizzeriaMenu cokolwiek = new PizzeriaMenu("  Hojny BOB");
        cokolwiek.showMenu();
        System.out.println("Jeśli chcesz Margeritę wybierz 1, hawajską wybierz 2, wegetariańska 3");
        int chooseNumber = placek.nextInt();
        // w int przechowujemy liczbe od uzytkownika i ten numer chcemy wypisac do order po nazwie


        System.out.println("brak w ofercie, wybierz inny numer");

cokolwiek.order(chooseNumber);
    }

}
