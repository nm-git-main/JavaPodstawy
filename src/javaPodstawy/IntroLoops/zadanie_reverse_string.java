package javaPodstawy.IntroLoops;

import java.util.Scanner;

public class zadanie_reverse_string {
    public static void main(String[] args) {


      /*  Scanner czytnik=new Scanner(System.in);
        System.out.println("Podaj dowolny napis, a zostanie on wyswietlony od tylu");
        String napis= czytnik.nextLine();

        for(int i= napis.length()-1; i>=0;i--){
            char znak= napis.charAt(i);
            System.out.print(znak);
        }
        System.out.println();
*/
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj dowolny napis, a zostanie on wyswietlony od tylu");
        String napis = czytnik.nextLine();
// dodajemy zmienną string wynik
        String wynik = "";
        for (int i = napis.length() - 1; i >= 0; i--) {
            char znak = napis.charAt(i);
            wynik += znak;
        }
        System.out.println();
        System.out.println(" Napis : " + napis + " od tylu to : " + wynik);

                /*
        int someVariable = 5;
        System.out.print(someVariable++);   // zostanie wypisana wartość 5, po wykonaniu tej linii kodu zmienna someVariable będzie miała wartość 6
        int someVariable = 5;
        System.out.print(++someVariable);   // zostanie wypisana wartość 6
        */

    }
}
