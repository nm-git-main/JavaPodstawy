package javaPodstawy.IntroFunkcjeKlasy;

public class MovieRunner {
    public static void main(String[] args) {
        Movie morderczaOpona = new Movie("Mordercza Opona");

        morderczaOpona.setGenre("gangsterski");  //ustawilismy po pozyskaniu informacji o tym filmie ze to gatunek
        String genre = morderczaOpona.getGenre();
        System.out.println(genre);

        Movie dlugiFilm = new Movie(300);
        Movie matrix = new Movie("Matrix", "Fantasy", 90);

        matrix.play();
        matrix.rate(7);
        //  matrix.getTitle(); do spr potem
        String title = matrix.getTitle();
        System.out.println(title);
        float score = matrix.getScore();
        System.out.println(score);

        matrix.rate(5);
        float actualScore = matrix.getScore();
        System.out.println(actualScore);

// nadpisana metoda toStrong
        String opis = matrix.toString();
        System.out.println(opis);

        System.out.println(morderczaOpona.toString());

    }


}
