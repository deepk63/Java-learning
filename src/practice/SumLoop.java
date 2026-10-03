package practice;

import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = scanner.nextInt();
        int num = 1;
        int sum = 0;

        while (num <= n) { //3
            sum = sum + num;
            num++;
        }
        System.out.println("sum=" + sum);
    }
}
