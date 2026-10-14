package homework.exercise2;

public class Main {
    public static void main(String[] args) {

        Phone mobile = new Phone();

        mobile.brand = "Apple";
        mobile.model = "Iphone 17 Pro";
        mobile.batteryLevel = 20;

        mobile.checkBattery();
    }
}
