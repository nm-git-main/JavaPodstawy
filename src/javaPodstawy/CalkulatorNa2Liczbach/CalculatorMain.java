package javaPodstawy.CalkulatorNa2Liczbach;
// pobierz pierwsza liczbe int
// pobierz jeden ze znakow + - / *
// pobrac druga liczbe
// zwrocic wynik dzialania
// wyjatki jesli poda inny znak wypisz Bledny znak

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe dodatnia");
        float liczba1 = in.nextFloat();

        System.out.println("Podaj znak do wykonania dzialania, mozesz wybrac + - / *");
        String znak = in.next();

        System.out.println("Podaj druga liczbe do wybranego dzialania");
        float liczba2= in.nextFloat();
try{
    System.out.println(liczba1+ " "+ znak
            + "  "+ liczba2+ " = "
            + calculateMySimpleCalculation(liczba1,liczba2,znak));
}catch (DevideByZeroException e){
    System.out.println("Blad");
}catch(WrongCharException e){
    System.out.println("Bledny znak");
}


    }
    public static float calculateMySimpleCalculation(float liczba1, float liczba2, String znak)throws DevideByZeroException, WrongCharException {

        switch (znak){
            case "+":
               return liczba1 + liczba2;

            case "-":
                return liczba1 - liczba2;

            case "*":
                return liczba1 * liczba2;

            case "/":
                if(liczba2==0){
                    throw new DevideByZeroException();
                }
               return liczba1 / liczba2;
            default:
               throw new WrongCharException();
        }
    }
}
