package Oct03;

public class Animal {
    // instance variables
    String name;
    String color;
    boolean carnivorous;
   // int legs;

    void makeSound(){
        System.out.println(name + "makes sound.");
    }


    void run(){
        System.out.println("Animal can run");
    }

    void printDetails(){
        System.out.println("Animal name is " + name + " color is " + color + " and is carnivorous --> "+ carnivorous);
    }

    int noOfLegs(int legs){
        return legs;
    }


}
