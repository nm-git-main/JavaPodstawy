package javaPodstawy.LibraryApp;
// b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author)
// oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)

public class Poem {
    private Author creator;
    private int strophNumbers;

    public Poem (Author creator, int strophNumbers){
        this.strophNumbers=strophNumbers;
        this.creator=creator;
    }



    public Author getCreator() {
        return creator = creator;
    }
public int getStrophNumbers(){
        return strophNumbers;
}
public void setCreator(Author creator){
        this.creator= creator;
}
public void setStrophNumbers(int strophNumbers){
        this. strophNumbers=strophNumbers;
}

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", strophNumbers=" + strophNumbers +
                '}';
    }
}

