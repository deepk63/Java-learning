package oct27;

public class OrderMain {

    public static void main(String[] args) {

        Order order1 = new RegularOrder();
        System.out.println("Regular Amount: " + order1.calculateFinalAmount(2000));

        Order order2 = new PrimeOrder();
        System.out.println("Prime Amount: " + order2.calculateFinalAmount(2000));

        Order order3 = new FestiveOrder();
        System.out.println("Festive Amount: " + order3.calculateFinalAmount(2000));
    }
}
