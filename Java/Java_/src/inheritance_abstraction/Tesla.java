package inheritance_abstraction;

public class Tesla extends Car implements LuxuryCar {


    public Tesla(int year, String model, String color, double price) {
        super(year, "Tesla", model, color, price);
    }

    @Override
    public void start() {
        System.out.println(make +" "+model+ " Say start");
    }

    @Override
    public void massage() {
        System.out.println("Welcome to the Tesla");
    }

    public static void carStatic(){
        System.out.println("Tesla Static");
    }
}
