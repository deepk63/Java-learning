package practice;

import java.util.Scanner;

public class EvenLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = scanner.nextInt();
        int num = 2;

        while (num <= n) {
            System.out.println(num);
            num = num + 2;
        }
    }
}
