package homework.exercise8;

public class DogMain {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Scooby";
        dog1.isHungry = true;

        Dog dog2 = new Dog();

        dog2.name = "Snowy";
        dog2.isHungry  = false;

        System.out.println("====Dog 1====");
        dog1.bark();
        dog1.feed();

        System.out.println("====Dog 2====");
        dog2.bark();
        dog2.feed();
    }
}
