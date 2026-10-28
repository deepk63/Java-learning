package oct27;

public class CreditCard extends Payment{

    @Override
    void pay() {
        System.out.println("Payment processing using Credit Card");
    }
}
