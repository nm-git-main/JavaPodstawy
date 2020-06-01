package javaPodstawy.LibraryApp;

import java.util.Scanner;

public class Author {
    // a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól
    // surname oraz nationality (oba typu String)

    private String surname;
    private String nationality;

    public Author(String surname, String nationality){
        this.surname=surname;
        this.nationality=nationality;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
