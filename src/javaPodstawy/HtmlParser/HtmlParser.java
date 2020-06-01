package javaPodstawy.HtmlParser;

public class HtmlParser {


    //<h1>Witam serdecznie SUPER KURS!</h1><P>To jest PLIK tekstowy</p>
    public String lineHtmlToUpperCase(String line) {
        String[] tablicaZnakow = line.split("");

        StringBuilder builder = new StringBuilder();
        boolean czyDuzeLitery = false;

        for (String letter : tablicaZnakow) {
            if (letter.equals("<")) {
                czyDuzeLitery = true;
                builder.append('<');
            } else if (letter.equals(">")) {
                czyDuzeLitery = false;
                builder.append('>');
            } else {
                if (czyDuzeLitery) {
                    builder.append(letter.toUpperCase());
                } else {
                    builder.append(letter);
                }
            }
        }
        return builder.toString();
    }


}
