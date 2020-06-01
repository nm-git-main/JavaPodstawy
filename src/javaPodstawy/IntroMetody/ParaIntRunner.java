package javaPodstawy.IntroMetody;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParaIntRunner {
    public static void main(String[] args) {
        System.out.println("Zad 1");

        //Zad1         // Zdefiniuj funkcję wypisującą liczby podzielne przez 5 z zakresu 1 - 500;
        liczbyPodzielnePrzez5ZZakresu1Do500();
        //Zad 2
        System.out.println("Zad 2. Bede wypisywac liczby podzielne przez 5");
        System.out.println("Podaj zakres liczb z zakresu n do m podajac najpierw n potem m");
        ParaInt parkaIntow = wczytywanieIntow(false);
        int n = parkaIntow.getLewy();
        int m = parkaIntow.getPrawy();
        liczbyPodzielnePrzez5ZZakresuNM(n, m);

        //Zad 3
        System.out.println("Zad 3. Bede dodawać liczby naturalne");
        System.out.println("Podaj prosze dwie liczby dodatnie i calkowite");


        parkaIntow = wczytywanieIntow(true);
        int x = parkaIntow.getLewy();
        int y = parkaIntow.getPrawy();
        System.out.println(x + " + " + y + " = " + funckaDodajacaDwieLiczbyNaturalne(x, y));

        // Zad 4 Napisz program, który sprawdza czy podana liczba jest liczbą pierwszą

        int nowyInt=wczytywanieJednegoInta();
        if (czyPierwsza(nowyInt)){
            System.out.println(nowyInt+ " jest liczba pierwsza");
        }else{
            System.out.println(nowyInt+ " nie jest liczba pierwsza");
        }


        }



    public static ParaInt wczytywanieIntow(boolean isNatural) {
        Scanner in = new Scanner(System.in);
        while (true) {
            if (isNatural){
                System.out.println("Podaj dwie liczby naturalne");
            }else{
                System.out.println("Podaj dwie liczby calkowite");
            }
            try {
                int a = in.nextInt();
                int b = in.nextInt();

                if(isNatural){
                    if(a<0 || b<0 ){
                        System.out.println("To mialy byc naturalne liczby");
                        continue;
                    }
                }
                return new ParaInt(a, b);
            } catch (InputMismatchException ex) {
                System.out.println("to mialy byc liczby");
                in.next();

            }
        }
    }

    public static int wczytywanieJednegoInta() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int a = in.nextInt();
                return a;
            } catch (InputMismatchException ex) {
                System.out.println("to mialy byc liczby");
                in.next();

            }
        }
    }

    public static void liczbyPodzielnePrzez5ZZakresu1Do500() {
        for (int i = 5; i <= 500; i = i + 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // Zadanie 2
    //Zdefiniuj funkcję wypisującą liczby podzielne przez 5 z zakresu m;n
    //(wartości m, n - wczytane od uzytkownika)

    public static void liczbyPodzielnePrzez5ZZakresuNM(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Zad 3 Zdefiniuj funkcję dodającą dwie liczby naturalne i zwracającą sumę tych liczb
    public static int funckaDodajacaDwieLiczbyNaturalne(int x, int y) {
        return x + y;
    }
    public static ParaInt wczytywanieIntowNaturalnych() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int a = in.nextInt();
                int b = in.nextInt();
                if(a<0 || b<0){
                    System.out.println("to mialy byc lczby naturalne");
                }
                return new ParaInt(a, b);
            } catch (InputMismatchException ex) {
                System.out.println("to mialy byc liczby");
                in.next();

            }
        }
    }
    public static ParaInt wczytywanieIntowCalkowitych() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int a = in.nextInt();
                int b = in.nextInt();
                return new ParaInt(a, b);
            } catch (InputMismatchException ex) {
                System.out.println("to mialy byc liczby całkowity");
                in.next();

            }
        }
    }
    public static boolean czyPierwsza(int candydatNaLiczbePierwsza){

        for(int i=2;i<=candydatNaLiczbePierwsza/2;i++){
            if(candydatNaLiczbePierwsza%i==0){
               return false;
            }
        }
        return true;

    }

}
