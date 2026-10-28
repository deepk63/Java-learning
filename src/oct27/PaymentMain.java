package oct27;

public class PaymentMain {

    public static void main(String[] args) {

        Payment payment = new CreditCard();
        payment.pay();

        Payment payment1 = new DebitCard();
        payment1.pay();
    }
}
