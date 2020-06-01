package javaPodstawy.IntroMetodyDalej;

import java.util.Scanner;

public class Fala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnia liczbe parzysta");
        int liczbaFal = scanner.nextInt();

        if (liczbaFal % 2 != 0) {
            System.out.println("To nie jest parzysta liczba, nastepnym razem parzysta");
            return;
        }
        waveCreator(liczbaFal);
    }
    private static void waveCreator(int liczbaFal) {
        for (int i = 0; i < liczbaFal; i++) {
            System.out.print("*      *");
        }
        System.out.println();

        for (int i = 0; i < liczbaFal; i++) {
            System.out.print(" *    * ");
        }
        System.out.print("\n");
        for (int i = 0; i < liczbaFal; i++) {
            System.out.print("  *  *  ");
        }
        System.out.print("\n");
        for (int i = 0; i < liczbaFal; i++) {
            System.out.print("   **   ");
        }
        System.out.println("\n");
    }
}
// liczbaFal=4
//*      **      **      **      *
// *    *  *    *  *    *  *    *
//  *  *    *  *    *  *    *  *
//   **      **      **      **

