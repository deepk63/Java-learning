package Sept29;

public class Main {

    public static void main(String[] args) {

        Car vehicle1 = new Car();

        vehicle1.brand = "Honda";
        vehicle1.model = "Civic";
        vehicle1.year = 2019;
        vehicle1.color = "Black";

        Car vehicle2 = new Car();

        vehicle2.brand = "Toyota";
        vehicle2.model = "Camry";
        vehicle2.year = 2022;
        vehicle2.color ="White";

        System.out.println("=== Printing Vehicle 1 ===");

        vehicle1.carSpeed();

        vehicle1.displayInfo();

//        System.out.println("Brand:"+vehicle1.brand);
//        System.out.println("Model:"+vehicle1.model);
//        System.out.println("Color:"+vehicle1.color);
//        System.out.println("Year:"+vehicle1.year);

        System.out.println("=== Printing Vehicle 2 ===");

        vehicle2.carSpeed();

        vehicle2.displayInfo();

//        System.out.println("Brand:"+vehicle2.brand);
//        System.out.println("Model:"+vehicle2.model);
//        System.out.println("Color:"+vehicle2.color);
//        System.out.println("Year:"+vehicle2.year);
    }
}
