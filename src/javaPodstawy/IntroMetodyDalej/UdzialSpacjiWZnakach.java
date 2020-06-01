package javaPodstawy.IntroMetodyDalej;


import java.text.DecimalFormat;
import java.util.Scanner;

public class UdzialSpacjiWZnakach {
    public static void main(String[] args) {
        //Napisz program, który pobierze od użytkownika tekst (zmienną typu String) i policzy
        //jakim procentem wszystkich znaków tekstu był znak spacji,
        //(czyli
        //)

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj zdanie z wieloma wyrazami");
        String zdanie = in.nextLine();

        int licznikSpacji = 0;

        for (int i = 0; i < zdanie.length(); i++) {
            if (zdanie.charAt(i) == ' ') {
                licznikSpacji++;
            }
        }
        double udzialSpacji= ((double)licznikSpacji/zdanie.length())*100;

        DecimalFormat wynik= new DecimalFormat();

        wynik.setMaximumFractionDigits(2);
        wynik.setMinimumFractionDigits(0);

        System.out.println("spacje w zdaniu"+ zdanie+"\n"+"udzial spacji w zdaniu to : " +wynik.format(udzialSpacji)+ " %");
    }

}
