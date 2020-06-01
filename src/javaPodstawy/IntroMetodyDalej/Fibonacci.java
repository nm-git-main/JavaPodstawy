package javaPodstawy.IntroMetodyDalej;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Zadanie 7
        //Napisz program obliczający n-ty wyraz ciągu Fibonacciego (iteracyjnie)
        try {
            int lala = wczytywanieLiczb();
            System.out.println("n'ty wyraz ciagu Fibonacciego to: " + liczenieFibonacciego(lala));
        } catch (InputMismatchException e) {
            System.out.println(" To miala byc liczba");
        }
    }

    public static int wczytywanieLiczb() throws InputMismatchException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbę n dla której policze n-ty wyraz ciagu");
            int n = in.nextInt();
            return n;
        } catch (InputMismatchException e) {
            System.out.println("to miala być liczba");
            throw new InputMismatchException();
        }
    }

    public static long liczenieFibonacciego(int n) {
        long poprzedniaLiczba = 0;
        long nastepnaLiczba = 1;
        long suma = 0;

        if (n != 1) {
            for (int i = 1; i < n; i++) {
                suma = poprzedniaLiczba + nastepnaLiczba;
                poprzedniaLiczba = nastepnaLiczba;
                nastepnaLiczba = suma;
            }
            return suma;
        } else {
            return 1;
        }
    }
}