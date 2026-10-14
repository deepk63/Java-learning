package homework.exercise10;

public class RentalMain {

    public static void main(String[] args) {

        RentalCar car1 = new RentalCar();

        car1.model = "Civic";
        car1.isRented = false;

        RentalCar car2 = new RentalCar();

        car2.model = "Elantra";
        car2.isRented = true;

        System.out.println("=====Car 1=====");
        car1.rentCar();
        car1.returnCar();

        System.out.println();
        System.out.println("=====Car 2=====");
        car2.rentCar();
        car2.returnCar();
    }
}
