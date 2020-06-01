package javaPodstawy.DataLocalKalendarz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DniTygodnia {
    //Zadanie 5. Dzień tygodnia
    //Zaimplementuj algorytm wyznaczający dzień tygodnia za n dni.
    //Dni tygodnia będziemy oznaczać skrótami: Pn, Wt, Sr, Czw, Pt, Sb, Nd.
    //Wejście
    //Przypadek składa się ze skrótu dnia tygodnia i liczby n (1 ≤ n ≤ 109).
    //Wyjście
    //Skrót dnia tygodnia, który nastąpi za n dni licząc od dnia tygodnia podanego na wejściu.
    //Przykład

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj prosze dzien tygodnia od ktorego bede liczyc ilosc dni, np. Pn, Wt, Sr, Czw, Pt, Sb, Nd");
        String wprowadzonyDzien = in.nextLine();
        System.out.println(" Podaj jeszcze liczbe x z zakresu <1,109>");
        int x = in.nextInt();

        DayOfWeek day = dayFromString(wprowadzonyDzien);
        DayOfWeek wynik= obliczDzienZaXDni(day, x);
        System.out.println(wynik);

    }

    public static DayOfWeek obliczDzienZaXDni(DayOfWeek day, int x) {
        return  day.plus(x);
    }

    public static DayOfWeek dayFromString(String dayInString) {
        if (dayInString.equals("Pn")) {
            return DayOfWeek.MONDAY;
        }
        if (dayInString.equals("Wt")) {
            return DayOfWeek.TUESDAY;
        }
        if (dayInString.equals("Sr")) {
            return DayOfWeek.WEDNESDAY;
        }
        if (dayInString.equals("Czw")) {
            return DayOfWeek.THURSDAY;
        }
        if (dayInString.equals("Pt")) {
            return DayOfWeek.FRIDAY;
        }
        if (dayInString.equals("Sb")) {
            return DayOfWeek.SATURDAY;
        }

        if (dayInString.equals("Nd")) {
            return DayOfWeek.SUNDAY;
        }
        return null;
    }

}

//public enum DayOfWeek implements TemporalAccessor, TemporalAdjuster {
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY,
//    SUNDAY;