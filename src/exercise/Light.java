package exercise;

public class Light {

    boolean isOn = true;

    void toggle() {
        isOn = !isOn;
        if (isOn) {
            System.out.println("Light is ON.");
        } else {
            System.out.println("Light is OFF.");
        }
    }
}
