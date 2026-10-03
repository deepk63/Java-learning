package practice;

public class Main{

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int a = 25;
        int b = 10;

        boolean resultAND = x > y && x > a;
        boolean resultOR = x > y || x < a;
        boolean resultNOT = !(x > y || x < a);

        System.out.println(resultAND);
        System.out.println(resultOR);
        System.out.println(resultNOT);
        System.out.println("Hello World");
        System.out.println("My Name is Deepak");
        System.out.println("I Stay in Barrie");
    }
}