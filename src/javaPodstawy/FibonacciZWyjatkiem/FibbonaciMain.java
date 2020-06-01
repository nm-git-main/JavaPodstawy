package javaPodstawy.FibonacciZWyjatkiem;


import java.util.InputMismatchException;
import java.util.Scanner;

public class FibbonaciMain {
    public static void main(String[] args) {
// pobierze int liczbe dodatnia i obliczy Fibonacciego o wskazanym indeksie, oblicz
        // kolejne liczby Fibonacciego sa suma dwóch poprzednich
        // np 1 1 2 3 5 8 13 21 34 55 ....
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna dodatnia, oblicze liczbe Fibonacciego o wskazanym przez Ciebie indeksie");
        try {
            int newFibonacciNumber = in.nextInt();
            System.out.println(calculateNFibonacciNumber(newFibonacciNumber));
        } catch (InputMismatchException e) {
            System.out.println("Nie badz glupi, miales wpisac liczbe naturanla");
        } catch (NumberBelowZeroException ex) {
            System.out.println("Niestety musisz podać liczbe dodatnia");
        }
    }

    private static long calculateNFibonacciNumber(int newFibonacciNumber) throws NumberBelowZeroException {
        if (newFibonacciNumber < 0) {
            throw new NumberBelowZeroException();
        }
        long pierwszy = 0;
        long drugi = 1;
        long wynik = 0;
        if (newFibonacciNumber == 0) {
            return 0;
        }
        for (int i = 2; i <= newFibonacciNumber; i++) {
            wynik = pierwszy + drugi;
            pierwszy = drugi;
            drugi = wynik;

        }
        return drugi;
    }
}
