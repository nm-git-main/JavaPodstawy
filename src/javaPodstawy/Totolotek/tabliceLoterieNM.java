package javaPodstawy.Totolotek;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tabliceLoterieNM {
    public static void main(String[] args) {
        /** dodać Random klase - konstruktor by sie nie meczyc z zaokragalniem liczby ranodomowej int  **/
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Ile musisz wylosowac? ");
        int k = in.nextInt();

        System.out.println("Jaka jest najwieksza liczba?");
        int n = in.nextInt();
        // zapelniam tablice liczbami 1,2,...,n.

        int[] numbers = new int[n];
        // tablica wszystkich liczb do losowania wpisywana jest do tablicy numbers o n elementach
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        //losowanie k liczb i zapis drugiej tablicy
        int[] result = new int[k];
        for (int z = 0; z < result.length; z++) {
            // losowanie indeksu od 0 do n-1
            //Metoda Math.random zwraca losową liczbę zmiennoprzecinkową z zamkniętego przedziału 0-1  Dzięki pomnożeniu jej wyniku przez n uzyskujemy losową
            //liczbę z przedziału od 0 do n–1.
            /** int r = (int) (Math.random() * n);
             **/
            //zamieniono na poniższe losowanie indeksu
            int r = rand.nextInt(n);
            //przypisanie liczby z tablicy numbers o indeksie r do z elementu tablicy result
            result[z] = numbers[r];
            // przeniesienie ostatniego elemetu do losowej lokalizacji, aby nie wylosowac tej samej liczby
            // W tym celu zastępujemy element numbers[r] ostatnią liczbą
            //w tablicy i zmniejszamy n o 1.
            //przypisanie liczby z numbers[n-1] do pomocniczego elementy
            int temp = numbers[n - 1];

            //zamienienie miejsca z elementem n-1 naszej wylosowanej liczby
            numbers[n-1] = numbers[r];
            //przypisanie elementu n-1 w miejsce wczesniej wylosowanego elementu
            numbers[r]=temp;
           // Arrays.sort(numbers);
            n--;
        }
        // wydruk zapisanej tablicy
        Arrays.sort(result);
        System.out.println("Postaw na nastepujace liczby. Dzieki nim zdobedziesz bogactwo!");
        for (int r : result) {
            System.out.println(r);
        }


    }
}


/*
masz tablice
{1,2,3,4,5,6,7}
i n=7 i k=7 tak
zmienilem bo to bylo jednak od 1
nie od 0
to teraz np wylosujemy element z indeksem 2
to bierzemy ta 3 przekladamy do innej tablicy
i potem ta 3 zastepujemy np n+1
{1,2,8,4,5,6,7}
a potem sortujemy tablice
{1,2,4,5,6,7,8}
i zmniejszamy n zeby nie moglo wyslowac tego ostatniego elementu
nie wiem czy dobrze wytlumaczylem o co mi chodzi
ta druga tablica ma w naszym przypadku 7 elementow
i jak narazie wyglada tak:
{3,0,0,0,0,0,0}
i potem idziemy od nowa
z tego {1,2,4,5,6,7,8}
losujemy znowu jakis inny indeks
tylko tym razem nie od 0 do n
tylko od 0 do n--
wiec tego ostatniego elementu nie bierzemy pod uwage czyli nie bedzie powtorki
no i wylosowalismy  np 4 indeks
wiec znowu przekladamy ten element z 4 indeksu do innej tablicy
{3,6,0,0,0,0,0}
i zastepujemy ten 4 indeks wartoscia n+1
{1,2,3,4,8,7,8}
sortujemy {1,2,3,4,7,8,8}
i zmienijszamy znowu n o 1
itd
az wylosujemy tyle liczb ile potrzebujemy
Ale tak, ogolnie to chyba weszla moia idea, ale to drugie rozwiazanie co jest pod tym
chyba jest twoje
znaczy sie, tak zinpretowalem twoj tok myslenia
nie wiem czy o to ci chodzilo
 */