package homework.exercise14;

public class Bike extends Vehicle{

    double calculateRent(int days) {
        double total = days * 20; // Rental charge $20 per day
        return total;
    }
}
