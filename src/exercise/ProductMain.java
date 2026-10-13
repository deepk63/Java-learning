package exercise;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();

        product.name="Lays";
        product.price=20;
        product.applyDiscount(10);
    }
}
