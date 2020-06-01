package javaPodstawy.IntroFunkcjeKlasy;
//Zdefiniuj klasę Point do reprezentacji Punktu w przestrzeni kartezjańskiej. Klasa powinna
//zawierać pola x, y oraz metodę distanceFromOrigin(), która będzie zwracać odległość od
//początku układu współrzędnych


public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanceFromOrigin(){
        double distance =Math.sqrt(x*x+y*y);
        return distance;
    }


}
