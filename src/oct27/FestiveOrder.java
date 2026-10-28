package oct27;

public class FestiveOrder extends Order{

    @Override
    double calculateFinalAmount(double amount) {
        amount = amount - (amount * 0.20);
        return amount;
    }
}
