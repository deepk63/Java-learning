package practice;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        int correct = 1234;
        int attempts = 0;

        do {
            System.out.println("Enter your password");
            password = scanner.nextInt();
            attempts++;

            if (password == correct) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Wrong Password. Please try again");
            }

        } while (attempts < 3);
        if (password !=correct) {
            System.out.println("Account Locked");
        }
        }
    }

