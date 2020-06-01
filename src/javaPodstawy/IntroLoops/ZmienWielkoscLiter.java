package javaPodstawy.IntroLoops;

import java.util.Scanner;

public class ZmienWielkoscLiter {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj napis : ");
        String text = czytnik.nextLine();

        System.out.println("wybierz opcje: ");

        System.out.println("1 Zmien duze na male");
        System.out.println("2 Zamien male na duze");
        System.out.println("3 Zamien male na duze a duze na male");

        // A ->65
        // Z-90
        //a-> 97
        // z-> 122


        int wybor = czytnik.nextInt();
        String wynik = "";
        StringBuilder budowniczy = new StringBuilder();
        switch (wybor) {
            case 1: {
                System.out.println("wybrano 1");
                break;
            }
            case 2: {
                System.out.println("wybrano 2 - zamieniam male na duze");
                // iterujemy prze caly napis
                for (int i = 0; i < text.length(); i++) {
                    //pobieramy znak na itej pozycji
                    char litera = text.charAt(i);
                    //spr czy znak to mala litera jesli tak to zmieniamy litere mala na duza
                    if (litera >= 'a' && litera <= 'z') {
                        litera -= 32;
                    }
                    // przepisujemy znak do stinga wynikowego
                    wynik += litera;
                }
                break;
            }
            case 3:
                System.out.println(" wybrano 3 zamieniam male na duze a duze na male");
                for (int i = 0; i < text.length(); i++) {
                    char litera = text.charAt(i);
                    if (litera >= 'a' && litera <= 'z') {
                        litera -= 32;
                    } else if (litera >= 'A' && litera <= 'Z') {
                        litera += 32;
                    }
                    // w petli dodjaemy znak do naszego budowniczego
                    budowniczy.append(litera);
                }
                //wywolujemy metode toString gdy skonczymy iteracje i chemy uzyskac wybudowany napis
                wynik = budowniczy.toString();

                break;
            default:
                System.out.println("Zły wybór- nie ma takiej opcji");
                break;
        }
        // koniec switcha
        System.out.println("Napis to:" + wynik);
    }
}