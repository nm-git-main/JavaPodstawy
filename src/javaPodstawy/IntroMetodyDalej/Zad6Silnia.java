package javaPodstawy.IntroMetodyDalej;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad6Silnia {
    public static void main(String[] args) {
        //  Zadanie 6
        //  Napisz program obliczający silnię liczby naturalnej (iteracyjnie)
        int x = wczytywanieNaturalnych();
        liczenieSilni(x);
    }

    public static void liczenieSilni(int s) {
        long silnia = 1;
        for (int i = 2; i <= s; i++) {
            silnia *= i;
        }
        System.out.println("Silnia liczby :" + s + " to :" + silnia);

    }

    public static int wczytywanieNaturalnych() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj proszę liczbe od której oblicze silnie");

        while (true) {
            try {
                int s = in.nextInt();
                if (s < 0) {
                    System.out.println(" To musi być liczba dodatnia");
                    continue;
                }
               return s;
            } catch (InputMismatchException e) {
                System.out.println("To miala być liczba");
            }
        }
    }
}

