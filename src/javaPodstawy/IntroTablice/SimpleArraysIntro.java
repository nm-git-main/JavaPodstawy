package javaPodstawy.IntroTablice;
/*  program
* w piewszej werjsi liczby podane prze zuzytkownika
*utwozrzy 10 liczb calk i wypelni ja
10 liczb całkowitych i wypełni ją wartościami losowymi z [ 0, 10]
• wypisze na ekranie zawartość tablicy,
• wyznaczy najmniejszy oraz najwięszy element w tablicy,
* wyznaczy sume  w tablicy
• wyznaczy średnią arytmetyczną elementów tablicy,
• wyznaczy ile elementów jest mniejszych, ile większych od średniej.
• wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do pierwszego.
*/
import java.util.Random;
import java.util.Scanner;

public class SimpleArraysIntro {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        Random r=new Random();
        System.out.println("stworz 5 ocen(rozmiar tablicy):  ");
        //chcemy zeby uzytkownik podal rozm tablicy
        int rozmiar=5;
        //   int rozmiar=czytnik.nextInt();
        //tworzymy tablice o rozmiarze podanym prze uzytkow
        //gdybysmy chcieli tablice 10elementow to:
        // int [] oceny=new int[10]
         int[] oceny=new int[5];

        //wypelnianie tablicy samodzielnie add1
        // bo domyslne wart to same 0 0 0
        // przechodzimy w petli for prze zcala tablice i wpisujemy zadane oceny do tablicy
        // pzech od el 0 az do ostatniego pierwszy el o indeksie, ostatni o indeksie oceny length -1 stad ostra nierownosc i nie trzeba -1
        // dla rozmaiaru 5: 0,1,2,3,4 a oceny  length wynosi 5
        //zamiast 5 oceny.length
        for(int i=0;i<5;i++){
            System.out.println("Podaj " +(i+1)+"ocene");
            int ocena=czytnik.nextInt();//wczytanie wartosci z konsoli od uzytkownika
            oceny[i]=ocena;
        }
            // utwozrzy 10 liczb calk i wypelni ja
            //   int 10 = czytnik.nextInt();
            //  int[] oceny = new int[10];
        // wyswietlenie zawartosci tablicy
        for (int i = 0; i < 5; i++) {
            System.out.println("ocena" + (i + 1) + "  to:  " + oceny[i]);
        }
        // Obliczanie sredniej
        int suma=0;
        for(int i=0; i<oceny.length;i++){
          int ocena=oceny[i];
            suma+=ocena; // to samo : suma+=oceny[i];
        }
        // 23/5 trzeba int/in = int -> zamienic int na double jeden z nich zrobic double - rzutowanie
         //  double jakasLiczbaDouble=suma; // konwersja niejawna -> do wiekszego typu mniejszy przyspisuje
        double avg=(double)suma/oceny.length;
        System.out.print("Srednia ocen to: "+avg);
    }
}

