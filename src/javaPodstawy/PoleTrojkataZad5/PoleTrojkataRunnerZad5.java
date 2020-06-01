package javaPodstawy.PoleTrojkataZad5;


import java.util.InputMismatchException;
import java.util.Scanner;

public class PoleTrojkataRunnerZad5 {
    //Zadanie 5
    //Wczytaj długości trzech odcinków . Sprawdź czy można z nich zbudować trójkąt, jeżeli tak
    //to oblicz jego pole


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dlugosci boków trojkata wpisujac a,b,c np. 5,0 5,5 6,7");
        double a, b, c;

        while (true) {
            try {
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("To musza być liczby");
                in.nextLine();
            }
        }
        // spr czy trojkat da sie poskaladac z a b c

        PoleTrojkataMethods.poleTrojkata(a, b, c);

        double pole = PoleTrojkataMethods.poleTrojkataZeZwracaniem(a, b, c);
        if (pole != 0) {
            System.out.println("Pole trojkata to : " + pole);
        }

        try {
            pole = PoleTrojkataMethods.poleTrojkataZeZwracaniemWyjatek(a, b, c);
            System.out.println(" Pole trojkata to : " + pole);
        }catch(UnableToCreateTriangleException e){
            System.out.println("Nie mozna zbudowac trojkata z tych bokow");
        }

        /*else {
            System.out.println("Nie mozna zbudowac trojkata z tych bokow");
        }*/
    }


}
