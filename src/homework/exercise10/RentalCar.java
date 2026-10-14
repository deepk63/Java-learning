package homework.exercise10;

public class RentalCar {

    String model;
    boolean isRented;

    void rentCar() {
        if (!isRented){
            isRented = true;
            System.out.println(model+ " has been rented.");
        }
        else {
            System.out.println(model + " is already taken.");
        }
    }

    void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println(model + " has been returned.");
        }
        else {
            System.out.println(model + " is not rented.");
        }
    }
}
