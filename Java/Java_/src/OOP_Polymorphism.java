import inheritance_abstraction.BMW;
import inheritance_abstraction.Car;
import inheritance_abstraction.Tesla;

public class OOP_Polymorphism {
    public static void main(String[] args) {
        Car car = new Tesla(2019, "V3", "Black", 100000);
        car.start();
        ((Tesla)car).carStatic();
        System.out.println("======================================");
        car= new BMW(2019, "i8", "Black", 100000);
        car.start();
        ((BMW) car).carStatic();
    }
}
