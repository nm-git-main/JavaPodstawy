package javaPodstawy.IntroFunkcjeKlasy;

public class Car {
    private String color;
    private int maxSpeed;
    private String brand;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(int maxSpeed) {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }
// wersja toString ale najkrotsza zamiast .append
    public String toString(){
        return "color: "+color+", maxSpeed: "+maxSpeed+", brand : " + brand;
    }
}
// to jest źle 2 linijki ponizej
    //public void printCarParameters() {
        //System.out.println(String"Car color is:" + color, " max speed is: " + maxSpeed, "brand is: " + brand);}


/*
    @Override
    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("color:  ")
                .append(color)
                .append("  maxSpeed : ")
                .append(maxSpeed)
                .append("  brand :  ")
                .append(brand);
        return sb.toString();
    }
}
*/

/* do spr
public String toString(){
    return "{a:"+ a + ", b:" + b + ", c: " + c +"}";
}
public String toString(){
    StringBuilder sb = new StringBuilder(100);
    return sb.append("{a:").append(a)
            .append(", b:").append(b)
            .append(", c:").append(c)
            .append("}")
            .toString();
}

 */