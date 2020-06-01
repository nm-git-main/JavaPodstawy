package javaPodstawy.IntroLoops;

public class zadanie4BialeZnakiLicznik {
    public static void main(String[] args) {
        String napis = "Nataleczka szła do laseczka ";
        //mozna tak zrobić jak niżej ale mozna sie potrudzic nie wykorzystujac wbudowanej funkcji
        // System.out.println(napis.length());

        //tworzymy zmienna liczydło do liczenia liter
        int liczydlo = 0;
        for (int i = 0; i < napis.length(); i++) {
            char znak = napis.charAt(i);
            System.out.println(znak);
            liczydlo++;

        }
        System.out.println("KONIEC PETLI FOR ... ");
        System.out.println("dlugosc podanego napisu to: " + liczydlo);

        // bez bialych znakow- zwiekszamy licznik jezeli znak jest rózny od spacji

        String haslo = " jebla babka chlopa w leb jeb!";
        int literki = 0;
        for (int i = 0; i < haslo.length(); i++) {

            char symbole = haslo.charAt(i);
            if (symbole != ' ') {

                literki++;
            }
            System.out.println(symbole);


        }
        System.out.println("Długość napisu bez psacji to:  " + literki);


        // inne sposby sposob 1

        int counter = 0;
        for (int i = 0; i < napis.length(); i++) {
            char znak = napis.charAt(i);
            if (znak ==' ') {
                continue;
            } else {
                counter++;
            }
        }
        // inny sposob 2
        int licz=0;
        for(int i=0; i<napis.length(); i++) {
            char znak = napis.charAt(i);
            if (znak != ' ') {
                licz++;
            }
        }
        System.out.println("Napis bez stacji:  " + counter);
        System.out.println("Napis bez spacji :  "   + licz);

        }
    }



