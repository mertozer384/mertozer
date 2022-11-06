package inheritance_abstraction;

public abstract class Car {
    public final int year;
    public final String make, model;
    public  String color;
    public double price;

    public Car(int year, String make, String model, String color, double price) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public void drive(){
        System.out.println("Driving "+make+" "+model);
    }
    public abstract void start();

    public static void carStatic(){
        System.out.println("Car Static");
    }
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';



      //  return String.format("Car{year=%d, make='%s', model='%s', color='%s', price=%f}", year, make, model, color, price);
    }
}
