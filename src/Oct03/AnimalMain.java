package Oct03;

public class AnimalMain {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "Mufasa";
        lion.color = "Brown";
        lion.carnivorous = true;
        // lion.legs = 4;

        lion.makeSound();

        lion.run();

        lion.printDetails();

        System.out.println("No of Legs: " +lion.noOfLegs(4));
    }


}
