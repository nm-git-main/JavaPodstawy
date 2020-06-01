package javaPodstawy.DataLocalKalendarz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IleDniZostaloDoZajec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj date najblizszych zajec w formacie np. 2020-09-31, oblicze ile dni do nich pozostało");
        String wczytajDate = scanner.nextLine();

        LocalDate dataZajec= LocalDate.parse(wczytajDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate now=LocalDate.now();

       // System.out.println(Period.between(now,dataZajec));
        Period zostaloDoZajec= Period.between(now, dataZajec);
        System.out.println(" Do nastepnych zajec pozostalo: "
                +zostaloDoZajec.getYears()+ " lat, "
                + zostaloDoZajec.getMonths()+" miesiecy, oraz "
                + zostaloDoZajec.getDays()+" dni"+"\n Do zobaczenia");

    }
}
