package homework.exercise8;

public class Dog {
    String name;
    boolean isHungry;

    void bark() {
        if (isHungry) {
            System.out.println("Whine...");
        }
        else {
            System.out.println("Woof!");
        }

    }

    void feed() {
        if (!isHungry) {
            System.out.println(name + " is not Hungry.");
        }
    }
}
