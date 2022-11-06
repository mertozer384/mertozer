package inheritance_abstraction;

public class BMW extends Car implements LuxuryCar {
    public BMW(int year, String model, String color, double price) {
        super(year, "BMW", model, color, price);
    }

    @Override
    public void start() {
        System.out.println(make +" "+model+" Start the engine with the start stop button");
    }

    @Override
    public void massage() {
        System.out.println("Welcome to the BMW");
    }
    public static void carStatic(){
        System.out.println("BMW Static");
    }
}
