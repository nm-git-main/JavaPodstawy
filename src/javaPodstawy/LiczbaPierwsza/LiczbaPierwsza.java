package javaPodstawy.LiczbaPierwsza;

import java.util.InputMismatchException;
import java.util.Scanner;
//pobrac int od uzytkownika i sprawdzic zcy jest liczba pierwsza, pierwsza dzieli sie przez 1 i przez siebie tylko

public class LiczbaPierwsza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe dodatnia (typu int) najlepiej naturalna");
        try {
            int boundaryNumber = scanner.nextInt();
            printPrimeNumbers(boundaryNumber);
        } catch (InputMismatchException ex) {
            System.out.println("Miales podac inta");
        }catch (ThisNumberIsACrimeException e){
            System.out.println("Liczba ujemna to przestępstwo");}
    }

    public static void printPrimeNumbers(int boundary) throws ThisNumberIsACrimeException{
        if(boundary< 0){
            throw new ThisNumberIsACrimeException();
        }
        for (int i = 2; i < boundary; i++) {
            boolean isPrime = checkIsPrime(i);
            // boolean isPrime przechowuje true lub false dlatego zwracamy true lub fals
            // przez return true lub false
            if (isPrime) {
                System.out.println(i + " jest liczba pierwsza");
            }
        }
    }

    //mtorda tylko uzywana w tej metodzie private
    private static boolean checkIsPrime(int primeCandidate) {
        for (int j = 2; j < primeCandidate; j++) {
            if (primeCandidate % j == 0) {
                return false;
            }
        }
        return true;
    }
}
