package javaPodstawy.IntroFunkcjeKlasy;

public class PointRunner {
    public static void main(String[] args) {
        Point nowyPunkt=new Point(3,5);
        double distance=nowyPunkt.distanceFromOrigin();
        System.out.println(distance);
    }
}
