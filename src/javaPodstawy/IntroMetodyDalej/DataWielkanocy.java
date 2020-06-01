package javaPodstawy.IntroMetodyDalej;



    /*
    Zadanie 1. Wyznaczanie daty Wielkanocy
Przed przystąpieniem do zadań przeczytaj poniższy tekst, następnie wykonaj ćwiczenia a-e.
Wielkanoc jest tak zwanym świętem ruchomym - oznacza to, że każdego roku występuje w inny dzień.
Definicja mówi, iż przypada ona w pierwszą niedzielę po pierwszej pełni Księżyca przypadającej
po równonocy wiosennej. W 1991 roku Jean Meeus opublikował sposób na obliczanie daty Wielkanocy.
Aby obliczyć datę Wielkanocy:
·        Tworzymy zmienne a, b, c, d, e, f, g, h, i, k, l, m, p, zmienną przechowującą podany przez
użytkownika rok, a także obliczony dzień i miesiąc
·        Pobieramy rok od użytkownika
·        Za a podstaw resztę z dzielenia rok przez 19
·        Za b podstaw zaokrąglony w dół wynik dzielenia roku przez 100
·        Za c podstaw resztę z dzielenia roku przez 100
·        Za d podstaw zaokrąglony w dół wynik dzielenia b przez 4
·        Za e podstaw resztę z dzielenia b przez 4
·        Za f podstaw zaokrąglony w dół wynik działania ((b + 8) / 25)
·        Za g podstaw zaokrąglony w dół wynik działania ((b – f + 1) / 3)
·        Za h podstaw resztę z dzielenia przez 30 wyrażenia (19 * a + b – d – g + 15)
·        Za i podstaw zaokrąglony w dół wynik dzielenia c przez 4
·        Za k podstaw resztę z dzielenia c przez 4
·        Za l podstaw resztę z dzielenia przez 7 wyrażenia (32 + 2 * e + 2 * i – h – k)
·        Za m podstaw zaokrąglony w dół wynik dzielenia przez 451 wyrażenia
 (a + 11 * h + 22 * l)
·        Za p podstaw resztę z dzielenia przez 31 wyrażenia (h + l – 7 * m + 114)
Aby wyznaczyć dzień Wielkanocy do p należy dodać 1, z kolei do wyznaczania miesiąca trzeba zaokrąglając
 w dół podzielić (h + l – 7 * m + 114) przez 31. Jeżeli miesiąc wyszedł nam 4, wówczas Wielkanoc odbędzie
się w kwietniu. W każdym innym przypadku w marcu.
a)     Jakie działanie zwraca resztę z dzielenia? Czy wiesz jakim symbolem oznaczamy je w Javie?
b)     Jakiego typu podstawowego zmiennych użyjesz do implementacji?
c)     W niektórych punktach algorytmu należy zaokrąglić wynik w dół z dzielenia. W jaki sposób możesz to zrobić?
Czy potrzebujesz do tego specjalnej metody?
d)     Przy pomocy jakiej klasy możesz pobrać od użytkownika rok? Jakie znasz inne metody wprowadzania danych
do aplikacji (niekoniecznie przy pomocy klawiatury)?
e)     Przystąp do implementacji algorytmu. Przed rozpoczęciem pracy spróbuj rozpisać każde działanie na kartce.
Na wyjściu zwróć datę w formacie DD miesiąc RRRR np. dla roku 2015 Twój program powinien zwrócić 5 kwiecień 2015.\
     */

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DataWielkanocy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj prosze rok");
        int rokOdUzytkownika = scanner.nextInt();

        LocalDate dokladnaDataWielkanocy=policzDzienWielkanocy(rokOdUzytkownika);
        System.out.println("Dzień wielkanocy: "+ dokladnaDataWielkanocy);
    }

    public static LocalDate policzDzienWielkanocy(int rok) {
        int a, b, c, d, e, f, g, h, i, k, l, m, p;
        a = rok % 19;
        b = rok / 100;
        c = rok % 100;
        d = b / 4;
        e = b % 4;
        f = ((b + 8) / 25);
        g = ((b - f + 1) / 3);
        h = (19 * a + b - d - g + 15) % 30;
        i = c / 4;
        k = c % 4;
        l = (32 + 2 * e + 2 * i - h - k)%7;
        m = (a + 11 * h + 22 * l) / 451;
        p = (h + l - 7 * m + 114) % 31;
        int dzienWielkanocy = p + 1;
        int miesiacWielkanocy = (h + l - 7 * m + 114) / 31;

        if (miesiacWielkanocy == 4) {
            return LocalDate.of(rok, Month.APRIL, dzienWielkanocy);
        } else {
            return LocalDate.of(rok, Month.MARCH, dzienWielkanocy);
        }

    }
}
//by wyznaczyć dzień Wielkanocy do p należy dodać 1, z kolei do wyznaczania miesiąca trzeba zaokrąglając
// w dół podzielić (h + l – 7 * m + 114) przez 31. Jeżeli miesiąc wyszedł nam 4, wówczas Wielkanoc odbędzie
//się w kwietniu. W każdym innym przypadku w marcu.