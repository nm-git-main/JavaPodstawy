package javaPodstawy.IntroFunkcjeKlasy;

public class Movie {
    //stany opisujemy polami, pola moga byc private
    private String genre;
    private String title;
    private int length;
    private String review;
    // score=0 zebysmy mogli później przyrównywac do wyników kolejnych
    private float score = 0;
    private int scoreCounter = 0;
    private int totalScore = 0;

    //teraz zachowania tj. metody, metody raczej public
    public void play() {
        System.out.println("Odtwarzam film");
    }


    // to jest konstruktor bezparametrowu,
    // konstruktorem INICJIUJEMY POLA GETTERY I SETTERY
    public Movie() {
        title = "default title";
        genre = "deafult genre";
        length = 0;
    }

    public Movie(String title) {
        this.title = title;
    }

    public Movie(int length) {
        this.length = length;
    }


    // to jest konstruktor 3 parametrowy
    public Movie(String title, String genre, int length) {
        this.title = title;
        this.genre = genre;
        this.length = length;
    }


    public void rate(int rate) {
        // dodac do score rate
        scoreCounter++;
        totalScore = totalScore + rate;
        //inaczej piszemy totalScore+=rate
        // teraz srednia
        //rzutowanie zrobic bo score jest floatem a totalScore był intem a chcemy zostac przy float
        score = (float) totalScore / scoreCounter;

    }

    public String getTitle() {
        return title;
    }

    public float getScore() {
        return score;
    }

    public void setGenre(String genre) { //setter
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    // getter


   @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tytuł: ")
                .append(title)
                .append("   Gatunek :   ")
                .append(genre)
                .append("  długość:   ")
                .append(length)
                .append("    ocena :   ")
                .append(score);
        return sb.toString();

    }
}
