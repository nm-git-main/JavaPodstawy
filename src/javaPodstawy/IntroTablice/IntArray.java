package javaPodstawy.IntroTablice;

public class IntArray {
    public static void main(String[]args){
        //1 czym jest null
        //typy liczbowe(z malych liter): byte,short,int,long,float,double-> domyslna wartosc 0 (0.0)
        // typ znakowy= char -> domyslna wartosc 0
        //typ "prawda/falsz boolean -> domyslna wartsc false
        int wiek=0;

        //typ obiektowy: String, Scanner, Random, wszystkie inne typy
        // a także typ tablicowy: nawet tablica int -typu prostego jest obiektem



       // String str="";- to wyrzuciloby blad bo nei ma obszaru w pamieci do przechowania tej zmiennej

        String str=null; // str-> to jest referencja
        //dla tej referencji str-> nie ma zarezerwowanej pamieci
        // str ma wartosc null
        if(str!=null){
            System.out.println(str);
        String duzeLitery= str.toUpperCase();
        System.out.println(duzeLitery);

        }else{
            System.out.println("str jest nullem- nie mozna wykonac operajcji");

        }
//2. Tworzenie tablicy intm String itd


        int[]liczby=new int[10];

        for(int i=0;i<liczby.length; i++){
            int wartosc=liczby[i];
            System.out.println(wartosc);
        }
        System.out.println("Tablica stringow");
        String[]napisy=new String[10];
        for(int i=0;i>napisy.length;i++){
            String napis=napisy[i];
            System.out.println(napis);

        }
    }

}
