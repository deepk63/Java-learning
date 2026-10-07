package oct03;

public class ProductMain {
    public static void main(String[] args) {
        Product lays1 = new Product();
        Product lays2 = new Product();
        Product lays3 = new Product();

        Product cal1 = new Product();

        // First Product
        lays1.name = "Indian Masala";
        lays1.price = 5.0;
        lays1.quantity = 5;

        // Second Product
        lays2.name = "Salty";
        lays2.price = 5.0;
        lays2.quantity = 10;

        // Third Product
        lays3.name = "Sweet and Chilly";
        lays3.price = 5.0;
        lays3.quantity = 7;

        System.out.println("===============");

        lays1.printDetails();
        lays1.applyDiscount(10);
        lays1.bill();

        System.out.println("===============");

        lays2.printDetails();
        lays2.applyDiscount(10);
        lays2.bill();

        System.out.println("===============");

        lays3.printDetails();
        lays3.applyDiscount(10);
        lays3.bill();

        System.out.println(cal1.add(1,2));

    }
}
