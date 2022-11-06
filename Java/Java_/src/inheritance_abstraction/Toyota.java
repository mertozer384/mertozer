package inheritance_abstraction;

public final class Toyota extends Car { //Toyota Is A Car

    public Toyota(int year, String model, String color, double price) {
        super(year, "Toyota", model, color, price);
    }


    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }
}


