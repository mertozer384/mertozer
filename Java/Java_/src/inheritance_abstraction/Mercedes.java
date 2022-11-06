package inheritance_abstraction;

public class Mercedes extends Car implements LuxuryCar{ //Mercedes Is A Car

    public Mercedes(int year, String model, String color, double price) {
        super(year, "Mercedes", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Start the engine with the start stop button");
    }

    @Override
    public void massage() {
        System.out.println("Welcome to the Mercedes");
    }

}
