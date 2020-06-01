package javaPodstawy.PoleTrojkataZad5;

public class PoleTrojkataMethods {
    public static void poleTrojkata(double a, double b, double c){
        if (a+b>c && b+c>a && a+c>b){
            double p=(a+b+c)/2;

            double pP= Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Pole trojkata wynosi : "+ pP);
        }else{
            System.out.println("Nie mozna stworzyc trojkata z takich dlugosci podanych bokow :"+ a+ " " + b+ " " + c);
        }

    }
    public static double poleTrojkataZeZwracaniem(double a, double b, double c){
        if (a+b>c && b+c>a && a+c>b){
            double p=(a+b+c)/2;

            double pP= Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return pP;
        }else{
            System.out.println("Nie mozna stworzyc trojkata z takich dlugosci podanych bokow :"+ a+ " " + b+ " " + c);
            return 0d;
        }

    }

    public static double poleTrojkataZeZwracaniemWyjatek(double a, double b, double c) throws UnableToCreateTriangleException{
        if (a+b>c && b+c>a && a+c>b){
            double p=(a+b+c)/2;

            double pP= Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return pP;
        }else{
            System.out.println("Nie mozna stworzyc trojkata z takich dlugosci podanych bokow :"+ a+ " " + b+ " " + c);
            throw new UnableToCreateTriangleException();
        }

    }
}
