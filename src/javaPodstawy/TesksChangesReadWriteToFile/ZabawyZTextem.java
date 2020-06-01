package javaPodstawy.TesksChangesReadWriteToFile;
import java.io.*;
import java.util.Scanner;


public class ZabawyZTextem {


        public static void main(String[] args) {
            try {
                readFromFile();
                writeToFile();
                readFromFile();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void readFromFile() throws FileNotFoundException {
            File file = new File("src\\javaPodstawy\\TesksChangesReadWriteToFile\\plik_tekstowy");
            Scanner scanner = new Scanner(file);
            String zawartoscPliku = "";
            while (scanner.hasNextLine()) {
                zawartoscPliku += scanner.nextLine() + ", ";
            }
            System.out.println(zawartoscPliku);
        }
        public static void writeToFile() throws IOException {
            File file = new File("src\\javaPodstawy\\TesksChangesReadWriteToFile\\Out.txt");
            FileWriter printer = new FileWriter(file, true);
            printer.append("nie no Eryk jednak lubi koty");
            printer.close();
        }
    }

