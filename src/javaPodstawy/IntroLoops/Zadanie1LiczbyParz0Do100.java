package javaPodstawy.IntroLoops;

public class Zadanie1LiczbyParz0Do100 {
    public static void main(String[] args) {


        // petla while liczby od 0 -100 teraz tylko parzyste
        System.out.println("petla WHILE");
        int licznik = 0;
        while (licznik <= 100) {
            System.out.print(licznik + " ,");
            licznik++;
        }
        //  System.out.println("Koniec petla while");
        System.out.println();
        System.out.println("Koniec petli WHILE");

        // petla for - liczby od 0 do 100

        System.out.println("petla FOR");
        //petla for liczby od 0 do 100
        for (int i = 0; i < 101; i += 2) {
            System.out.print(i + " ,  ");
        }
        System.out.println();
        System.out.println("koniec petla FOR");
        System.out.println();


        // petla do while - liczby od 0- 100

        System.out.println("Petla DO WHILE");
        int liczby = 0;
        do {
            System.out.print(liczby + " , ");
            liczby += 2;
        } while (liczby < 101);

// liczby nieparzyste od 0 do 100
        // 5%2=3, bo 3*1+2=5; 9%2=1, bo 4*2+1=9, 25%5=0, bo 5*5+0=25
        // jak stwierdzić czy liczba jest parzysta-jak dizeli sie przez 2
        System.out.println();
        System.out.println();


        System.out.println("petla FOR dla liczb nieprazystych");

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ,");

            }

        }
        System.out.println();
        // ZADANIE 2 wyswietl na ekranie wszystkie liczby podzielne przez 7 z zakresu 1 ... 500

        System.out.println("petla FOR dla liczb podzielnych przez 7 z zakresu <1,500>");
        for (int i = 1; i < 501; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " , ");

            }


        }


// instrukcja for sumuje liczby całkowite od 1 do 100

        System.out.println("sumowanie liczb od 1 do 100 za pomocą instrukcji for");
        System.out.println();

        int suma=0;
        for(int i=1; i<101;i++ ){
            //suma=suma+i;
            suma+=i;
        }
System.out.println("suma od liczby 1 do 100 to: "  + suma);

// zadanie 4 program zliczajacy dlugosc łancuch znakowego z białymi znakami i bez bialych znaków
        System.out.println("program zliczajacy dlugosc łancucha znakowego z białymi znakami");
        System.out.println();

    }
    }