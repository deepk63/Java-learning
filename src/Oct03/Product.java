package Oct03;

public class Product {

    String name;
    double price;
    int quantity;

    void printDetails(){
        System.out.println(name +": Crispy potato chips with delicious,savoury flavour.");
    }

    void applyDiscount(int discount){
        System.out.println("Discount: "+(price = price* discount/100));

    }

    void bill(){
        System.out.println("Total:" +(price*quantity));
    }

    int add(int a, int b){
        return a+b;
    }

}
