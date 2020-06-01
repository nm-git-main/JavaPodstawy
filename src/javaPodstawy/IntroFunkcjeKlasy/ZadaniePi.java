package javaPodstawy.IntroFunkcjeKlasy;

import java.util.Scanner;

public class ZadaniePi {
    private final static float Pi = 3.14f;

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj srednice do obliczen");
        float srednica = in.nextFloat();
        float obwod = circleFerence(srednica);
        float obwod2= circleFerenceUsingMath(srednica);
        System.out.println("Obwod Twojego kola to :" + obwod);
        System.out.println("Obwód Twojego kola z funkcji Math:  "+ obwod2);
    }

    static float circleFerence(float diameter) {
        float obwod = diameter * Pi;
        System.out.println();

        return obwod;
    }
    static float circleFerenceUsingMath (float diameter){
        float obwod2=diameter * (float)Math.PI;
        return obwod2;
    }
}