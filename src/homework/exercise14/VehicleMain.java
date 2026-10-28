package homework.exercise14;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car();
        System.out.println("Total Car rental amount: " + vehicle1.calculateRent(5));

        Vehicle vehicle2 = new Bike();
        System.out.println("Total Bike rental amount: " + vehicle2.calculateRent(2));

    }
}
