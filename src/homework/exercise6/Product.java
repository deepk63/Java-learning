package homework.exercise6;

public class Product {
    String name;
    double price;

    void applyDiscount(double percentage){

        double discount = price * percentage/100;
        double newPrice = price - discount;
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount + " (" + percentage + " %)");
        System.out.println("New Price: " + newPrice);
    }
}
