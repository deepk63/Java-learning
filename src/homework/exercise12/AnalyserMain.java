package homework.exercise12;

import java.util.Scanner;

public class AnalyserMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Positive number");
        int number = scanner.nextInt();

        int temp = number;
        int digit;
        int sum = 0;
        int reverse = 0;

        while (temp > 0) {

            digit = temp % 10;
            sum = sum + digit;
            reverse = reverse * 10 + digit;
            temp = temp / 10;

        }

        System.out.println("Sum of Digits: " + sum);
        System.out.println("Reverse of Number: " + reverse);

        if (number == reverse) {
            System.out.println("Palindrome : Yes");
        } else {
            System.out.println("Palindrome : No");
        }

        switch (number % 3) {
            case 0:
                System.out.println("Divisible by 3");
                break;
            case 1:
                System.out.println("Remainder is 1");
                break;
            case 2:
                System.out.println("Remainder is 2");
                break;
        }

    }
}
