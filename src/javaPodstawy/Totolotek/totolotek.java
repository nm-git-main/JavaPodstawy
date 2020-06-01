package javaPodstawy.Totolotek;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class totolotek {
    public static void main(String[] args) {
        // pobierz od uzytkownika 6 liczb
        // wybierz losowo 6 z 49 liczb
        // i wpisz do tablicy

        System.out.println("Podaj prosze liczb oddzielajac kolejne liczby przecinkami z zakresu 1-49");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        // 9 ,48, 17, 15, 21, 13
        //
        // String[] splitNumbers = line.replaceAll(" ", " ").split(",");
        String trimLine = line.replaceAll(" ", "");
        //9,48,17,15,21,13
        String[] strNumbers = trimLine.split(",");
        //94817152113

        int[] numbers = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            //konwersja kazdego elementu tablicy numbers na kazdy element strNumbers
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        // wylosuj 6 liczb w komorze losujacei porownaj z 6 liczbami uzytkownika
        //robimy taka tablice do ktorej je wpiszemy
        int[] happyNumbers = new int[strNumbers.length];
        // wylosujemy tyle liczb ile wpisal uzytkownik
        for (int i = 0; i < happyNumbers.length; i++) {
            Random rand = new Random();
            int number = rand.nextInt(49) + 1;
            happyNumbers[i] = number;
        }
        //porownujemy wylosowane z liczbami wprowadzonymi od uzytkownika
        int winnerCounter = 0;
        for (int i = 0; i < happyNumbers.length; i++) {
            if (numbers[i] == happyNumbers[i]) {
                winnerCounter++;
            }
        }
// ogłaszamy zwyciezkie wyniki
        switch (winnerCounter) {
            case 0:
                System.out.println("Totalne pudlo");
                break;
            case 1:
                System.out.println("Przegrałes");
                break;
            case 2:
                System.out.println("Troche mniej przgrales");
                break;
            case 3:
                System.out.println("Wygrales ale tylko na piwo");
                break;
            case 4:
                System.out.println("Wygrałes, ale na wiecej niz jedno piwo");
                break;
            case 5:
                System.out.println("Wygrałes tira piwa");
                break;
            case 6:
                System.out.println("Masz piwo do konca zycia");
                break;
        }
        System.out.println(Arrays.toString(happyNumbers));
        System.out.println(winnerCounter);
    }

}
