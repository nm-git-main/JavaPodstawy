package javaPodstawy.IntroFunkcjeKlasy;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        int result1 = multiplyTwoNumbers(15, 5);
        System.out.println(result1);
        String napis = "Eryk nie lubi kota";
//teraz pokazuje programowie ze ma wykorzystac drua funkcje
        printWhatIWant(napis);
        double sphereVolume = countSphereVolume(5);
        System.out.println(sphereVolume);
    }

    public static int multiplyTwoNumbers(int x, int y) {
        int sum = x * y;

        return sum;

    }

    static void printWhatIWant(String thisIsWhatIWant) {
        System.out.println(thisIsWhatIWant);
    }

    static double countSphereVolume(float radius) {
        double result = (float) 4 / 3 * Math.PI * Math.pow(radius, 3);
        return result;

    }
}

