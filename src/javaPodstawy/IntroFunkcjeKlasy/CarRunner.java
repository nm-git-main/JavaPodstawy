package javaPodstawy.IntroFunkcjeKlasy;

public class CarRunner {
   public static void main (String [] args){
       //tworzenie obektu klasy Car- car1 za pomoca konstrukta z uzyciem slowa new
       Car car1=new Car();
       car1.setColor("red");
       car1.setBrand("Mercedes");
       car1.setMaxSpeed(230);


       Car car2=new Car();
       car2.setColor("white");
       car2.setBrand("BMW");
       car2.setMaxSpeed(200);

       System.out.println("car1: " +car1.toString());
       System.out.println("car2: " + car2.toString());
   }
}
