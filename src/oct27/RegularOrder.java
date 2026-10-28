package oct27;

public class RegularOrder extends Order{

    @Override
    double calculateFinalAmount(double amount) {
        return amount;
    }
}
