package javaPodstawy.IntroLoops;

import java.util.Scanner;
// palindrom tak samo czyta sie od przodu i tylu
// kajak -> kajak-> palindrom nieparzysty
// anna- > anna -> palindorm parzysty (dlugosc znaków)
// pierwsza i ostatnia litera taka sama, 2od lewej i prawej taka sama, srodkowa nic nie zmienia dla nieparzystych

public class ZadaniePalindrom {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj napis, a ja sprawdze czy palindrom");
        String napis = czytnik.nextLine();
// ile obiegow petli -> .length()/2
        //sposób 1 dodatkowy licznik
        //int j=???
       boolean czyPalindrom = true;
        for (int i = 0, j = napis.length() - 1; i < napis.length() / 2; i++, j--) {
            if (napis.charAt(i) != napis.charAt(j)) {
                czyPalindrom = false;
                break;
            }
        }
        if(czyPalindrom){
            System.out.println("Napis :"+napis + "jest palindromem");
            }else{
            System.out.println("Napis: "+ napis + "nie jest palindormem");
        }
    }

       // boolean czyPalindrom = true;
        /*for (int i = 0, j = napis.length() - 1; i < napis.length() / 2; i++, j--) {
            if (napis.charAt(i) != napis.charAt(j)) {
                czyPalindrom = false;
                break;
            }


        }
        // kajak
        // 01234
        //i=0 j=napis.length()-1-i -> 5-1-0=4
        // i=1 j=5-1-1->3
        // jest to druga opcja bez j
    /*    for(int i=0;i<napis.length()/2;i++){
            if(napis.charAt(i)!=napis.charAt(napis.length()-1-i)){
                czyPalindrom=false;
                break;
            }
        }
        if (czyPalindrom) {
            System.out.println("Napis :" + napis + "jest palindromem");
        } else {
            System.out.println("Napis: " + napis + "nie jest palindormem");
        }
        */
}
