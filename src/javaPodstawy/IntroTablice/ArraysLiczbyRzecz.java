package javaPodstawy.IntroTablice;

import java.util.Scanner;

public class ArraysLiczbyRzecz {

    //Napisz program wczytujący ciąg liczb rzeczywistych. Wydrukuj na ekranie kolejno
    //wszystkie liczby, które należą do przedziału [4;15]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 9; i >= 0; i--) {
            //for (int i=0;i>0;i++) gdybyśmy chcieli iśc od poczatku tablicy, ale by bylo trudniej wypelniamy od konca
            System.out.println("Podaj kolejna liczbe");
            int nextInt = scanner.nextInt();
            numbers[i] = nextInt;
        }
        //Mozna nie wprowadzac dodatkowje zmiennej
        // for(int i=0;i<10;i++){
        //            int currentNumber=numbers[i];
        //            if(currentNumber>=4 && currentNumber<=15){
        //                System.out.println(currentNumber);
        for (int i = 0; i < 10; i++) {
            if (numbers[i]>= 4 && numbers[i] <= 15) {
                System.out.println(numbers[i]);
            }
        }

    }

}
