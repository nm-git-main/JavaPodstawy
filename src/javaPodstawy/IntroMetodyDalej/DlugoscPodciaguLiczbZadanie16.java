package javaPodstawy.IntroMetodyDalej;

import java.util.Scanner;

public class DlugoscPodciaguLiczbZadanie16 {

    //Zadanie 16.
    //Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int) i wypisze
    //długość najdłuższego takiego podciągu tych liczb, który jest rosnący.
    //Przykładowo, dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7” program powinien wypisać „5” jako
    //długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 10 liczba np: 2,4,5,... .");
        String wejscie = in.nextLine();
        String[] tablicaStringow = wejscie.trim()
                .replaceAll(" ", "")
                .split(",");
             /* for (String s:tablicaStringow) {
            System.out.println(s);
                 }*/
        int[] tablicaLiczb = new int[tablicaStringow.length];

        for (int i = 0; i < tablicaStringow.length; i++) {
            tablicaLiczb[i] = Integer.parseInt(tablicaStringow[i]);
        }
        int dlugoscPodciagu1 = 0;
        int max = 0;

        for (int i = 1; i < tablicaLiczb.length; i++) {
            if (tablicaLiczb[i-1] < tablicaLiczb[i]) {
                dlugoscPodciagu1++;
                if(dlugoscPodciagu1>max) {
                    max=dlugoscPodciagu1;
                }
            else{
                dlugoscPodciagu1=1;
                }

            }
            System.out.println(max);
        }


    }


}
