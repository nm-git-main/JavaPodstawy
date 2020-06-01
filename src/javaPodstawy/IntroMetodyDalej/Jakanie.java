package javaPodstawy.IntroMetodyDalej;

//Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu
//String), a następnie wypisuje podany tekst, w którym każde słowo wypisane jest po
//dwa razy.
//Przykładowo, dla wejścia: „To jest mój test” program powinien wypisać „To To jest jest
//mój mój test test”.


import java.util.Scanner;

public class Jakanie
{
    public static void main( String[] args )
    {
        Scanner in= new Scanner(System.in);
       // System.out.println(" Podaj zdanie");
        String jakanie1=in.nextLine();

        String [] tablicaWyrazow=jakanie1.trim().split(" ");

     // for each przypomnienie
        // for (String wyrazy: tablicaWyrazow){
        //    System.out.println(wyrazy+" "+ wyrazy+ " ");
       // }
        for (int i=0;i<tablicaWyrazow.length; i++){
            System.out.print(tablicaWyrazow[i]+ " "+ tablicaWyrazow[i]+ " ");
        }

    }
}
