package javaPodstawy.HtmlParser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HtmlParserRunner {


    public static void main(String[] args) throws IOException {
        String sciezkaDoplikuWejsciowego = "./plik.Html";

        File file = new File(sciezkaDoplikuWejsciowego);
        Scanner inFile = new Scanner(file);

        HtmlParser htmlParser = new HtmlParser();

        StringBuilder sb = new StringBuilder();
        while (inFile.hasNextLine()) {
            String line = inFile.nextLine();

            String upperCaseLine = htmlParser.lineHtmlToUpperCase(line);

            sb.append(upperCaseLine);
            sb.append('\n');
        }

        saveToFile(sb.toString());
    }

    public static void saveToFile(String tagTypuHtml) throws IOException {
        String resulPath = "./src/javaPodstawy/HtmlParcer/plik_tekstowy/";
        File file = new File(resulPath);

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(tagTypuHtml);
        fileWriter.close();


    }
}

