package javaPodstawy.LibraryApp;

/// c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
// i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi
// (używając konstruktora lub setter’ów) i zapiszesz je w tablicy
// ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie
// zwrotek (niech odpowiedź obliczy Twój program!)
public class Main {
    public static void main(String[] args) {
        StringBuilder autorzy= new StringBuilder();

        // robimy trzy obiekty, najpier tworzymy obiekt Author wpisujac jego nazwe
        Author adamMickiewicz = new Author("Adam Mickiewicz", "Polska");
        //po zadaniu autora musimy zrobic pola obiektu Poem, wiec poem ...= new Poem (tu podpowiada IJ 1,2)
        Poem odaDoMlodosci = new Poem(adamMickiewicz, 8);
        Poem panTadeusz = new Poem(adamMickiewicz, 1000);
        Poem wierszNieznany = new Poem(adamMickiewicz, 24);
        Poem wierszNieznany2 = new Poem(adamMickiewicz, 1000);

        // wpisujemy tytuly do tablicy
        Poem[] tomikPoezji = new Poem[]{odaDoMlodosci, panTadeusz, wierszNieznany,wierszNieznany2};
        // chcemy przejsc po poematach w tablicy poematów i porównywać poematy pod wzgledem stropNumbers

        int longestPoem = 0;



        for (int i = 0; i < tomikPoezji.length; i++) {
            Poem p = tomikPoezji[i];
            int str = p.getStrophNumbers();
            if (str>longestPoem){
                longestPoem=str;

            }
        }
        for (int i=0; i<tomikPoezji.length; i++){
            if(tomikPoezji[i].getStrophNumbers()== longestPoem){
                autorzy.append(i);
                System.out.println(tomikPoezji[i].getCreator().getSurname());
            }
        }

        }
    }
