package oct27;

public class PrimeOrder extends Order{

    @Override
    double calculateFinalAmount(double amount) {
        amount = amount - (amount * 0.10);
        return amount;
    }
}
