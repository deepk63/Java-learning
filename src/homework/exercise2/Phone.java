package homework.exercise2;

public class Phone {
    String brand;
    String model;
    int batteryLevel;

    void checkBattery() {
        if(batteryLevel <= 20){
            System.out.println(brand +" "+ model + " Battery is Low.");
        }
    }
}
