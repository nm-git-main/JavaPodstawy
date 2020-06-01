package javaPodstawy.IntroMetodyDalej;
//Zadanie 10.
//Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int) i
//obliczy sumę cyfr podanej liczby. Podpowiedź: aby rozpatrywać liczbę cyfra po
//cyfrze, możesz obliczać resztę z dzielenia liczby przez 10 (aby uzyskać wartość
//ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej
//cyfry).

import java.util.Scanner;

public class SumaCyfrPodanejLiczby {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj prosze liczbe naturalna");
        String numberToDeal = in.next();
        if (numberToDeal.matches("[0-9]+")) {
            int wynik = 0;
            for (int i = 0; i < numberToDeal.length(); i++) {
                wynik += numberToDeal.charAt(i) - 48;
                // lub   wynik += numberToDeal.charAt(i) - '0';
                // lub             // wyniki= wynik + numberToDeal.charAt(i)
                // 779
                // 0->7
                //1-> 7
                //2->9
            }
            System.out.println(wynik);
        } else {
            System.out.println("To miala byc liczba");
        }
        // poczatek nowego zadania
        int suma = 0;
        int liczbaNowa = in.nextInt();
        System.out.println("Podaj prosze liczbe");
        // 12
        while(liczbaNowa!=0){
            suma+=liczbaNowa%10; // bierze ostatnia liczba - suma =suma+ liczbaNowa%10 0+3=3/
            liczbaNowa/=10;
        }
        System.out.println(suma);
    }

}