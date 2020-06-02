package javaPodstawy.CamelCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CamelCaseRunner {

    //CamelCase jest konwencją notacji przyjętą w wielu językach programowania,
    // takich jak Java i C#, gdzie służy do zapisu nazw zmiennych, procedur, klas, itp.
    // Nazwa notacji camelCase wywodzi się z faktu, że przy jej zastosowaniu wielkie litery
    // w połączonych ze sobą słowach przypominają kształtem garby wielbłąda (ang. camel).
    // Konwencja ta została najprawdopodobniej użyta po raz pierwszy w języku programowania Smalltalk.
    //W latach 90-00 modne było tworzenie opisów w GG przy pomocy notacji przypominającej CamelCase –
    // jedna litera duża, druga mała np. JaK sIę CiEsZę (Jak się cieszę).
    //
    //a)	Zaimplementuj algorytm, który dla wprowadzonego przez użytkownika ciągu znaków zwróci
    // mu biednego CamelCase zgodnie z przykładem w tekście. Załóż, że program nie będzie wczytywał
    // polskich znaków, a spacja nie jest liczona jako litera (jest przepisywana).
    //b)	*Zastanów się czy jesteś w stanie „w locie” czytając znak po znaku ze źródła przekształcać
    // podany ciąg, aby zwracany był biedny CamelCase

    public static void main(String[] args) {

        File inputFile = new File("src\\javaPodstawy\\CamelCase\\input.txt");
        File outputFile = new File("src\\javaPodstawy\\CamelCase\\output.txt");
        PrintWriter printWriter;

        Scanner fileScanner;
        try {
            fileScanner = new Scanner(inputFile);
            printWriter = new PrintWriter(outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
            return;
        }
        System.out.println("To BeDziE pOoR cAmEl CaSe");

        while (fileScanner.hasNextLine()) {

            printToConsoleAndOutputFile(poorCamelCase(fileScanner.nextLine()), printWriter);
        }

        printWriter.close();
    }

    public static void printToConsoleAndOutputFile(String line, PrintWriter out) {
        System.out.println(line);
        out.println(line);
    }

    public static String poorCamelCase(String lineToChangeToPoorCamelCase) {
        boolean changeToUpperCase = true;
        StringBuilder sb2 = new StringBuilder();

        String[] letterArray = lineToChangeToPoorCamelCase.toLowerCase().split("");

/*
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letterArray.length; i++) {
            if (letterArray[i] != " ") {
                if (changeToUpperCase) {
                    letterArray[i] = letterArray[i].toUpperCase();
                    sb.append(letterArray[i]);
                    changeToUpperCase = false;
                } else {
                    sb.append(letterArray[i]);
                    changeToUpperCase = true;
                }
            } else {
                sb.append(' ');
            }
        }
*/
        for (char letter : lineToChangeToPoorCamelCase.toLowerCase().toCharArray()) {
            if (letter != ' ') {
                if (changeToUpperCase) {
                    // mała litera - 32 w ASCII to duża litera a ->97, A->65 :D można odjac spacje
                    // ' ' = 32 np letter -= ' '; jak char to ' ', jak stringi to " "
                    letter -= 32;
                    sb2.append(letter);
                    changeToUpperCase = false;
// nanana -> NaNaNa
                } else {
                    sb2.append(letter);
                    changeToUpperCase = true;
                }
            } else {
                sb2.append(' ');

            }
        }
        return sb2.toString();
    }
}
