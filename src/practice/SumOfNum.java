package practice;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int userInput1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int userInput2 = scanner.nextInt();

        int i = userInput1 + userInput2;
        System.out.println("Total=" + i);
        System.out.println("Total=" + (userInput1 + userInput2));
    }
}
