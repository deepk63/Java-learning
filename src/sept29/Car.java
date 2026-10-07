package sept29;

public class Car {
    String brand;
    String model;
    int year;
    String color;

    void carSpeed(){
        System.out.println(brand + " " + model + " is running at the speed of 100.");
    }

    void displayInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Color: "+ color);
        System.out.println("Year: "+ year);
    }
}
