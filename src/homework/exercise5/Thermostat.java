package homework.exercise5;

public class Thermostat {
    int currentTemperature = 20;

    void setTemperature(int targetTemp){
        currentTemperature = targetTemp;
        System.out.println("Temperature adjusted to " + targetTemp + " degrees.");
    }
}
