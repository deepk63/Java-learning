package exercise;

public class CounterMain {
    public static void main(String[] args) {

        Counter number = new Counter();
        number.count = 0;

        number.display();

        number.increment();
        number.display();
    }


}
