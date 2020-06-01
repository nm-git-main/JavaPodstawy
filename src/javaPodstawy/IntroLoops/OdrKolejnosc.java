package javaPodstawy.IntroLoops;

import javax.swing.*;
import java.util.Scanner;

public class OdrKolejnosc {
    public static void main(String[]args){
        Scanner czytnik=new Scanner(System.in);
        System.out.println("Podaj napis, a odwróce jego kolejność");
        String napis=czytnik.nextLine();


       String odwrNapis=" ";
       for(int i=napis.length()-1;i>=0;i-- ){
           char znak=napis.charAt(i);
           odwrNapis+=znak;
       }
       System.out.println();
        System.out.println("Wybrany przez Ciebie napis to"+ napis+  "  a odwrócony napis to : "  +  odwrNapis);


    }
}
