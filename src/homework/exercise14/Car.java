package homework.exercise14;

public class Car extends Vehicle{

    @Override
    double calculateRent(int days) {
        double total = days * 50; // Rental charge $50 per day
        return total;
    }
}
