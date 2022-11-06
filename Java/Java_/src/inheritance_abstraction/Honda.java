package inheritance_abstraction;

public final class Honda extends Car{


    public Honda(int year, String model, String color, double price) {
        super(year, "Honda", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("using start stop button");
    }

}
