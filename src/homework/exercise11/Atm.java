package homework.exercise11;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        // Pin Verification
        int correctPin = 1234;
        int enterPin;
        int attempts = 0;
        boolean pinVerified = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your Pin:");
            enterPin = scanner.nextInt();

            if (enterPin == correctPin) {
                System.out.println("Pin Verified. Welcome!");
                pinVerified = true;
            }
            else {
                attempts++;
                System.out.println("Incorrect Pin " + (3 - attempts) + " attempts remaining.");
            }
        }
        while (!pinVerified && attempts < 3);

        if (!pinVerified) {
            System.out.println("Card Blocked. Contact your Bank.");
        }

        // Printing Main Menu
        int balance = 10000;
        int choice = 0;

        int t1 = 0;
        int t2 = 0;
        int t3 = 0;

        if (pinVerified){
            do {
                System.out.println();
                System.out.println("=== ATM MENU ===");
                System.out.println("1.Check Balance");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Mini Statement");
                System.out.println("5.Exit");
                System.out.println();
                System.out.println("Enter your choice:");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1 :
                        System.out.println("Current balance: " + balance);
                        break;
                    case 2 :
                        System.out.println("Enter deposit amount:");
                        int amount = scanner.nextInt();

                        if (amount > 0 && amount % 100 == 0){
                            balance = balance + amount;
                            t1 = t2;
                            t2 = t3;
                            t3 = amount;

                            System.out.println("Deposit Successful.");
                            System.out.println("New Balance: " + balance);
                        }
                        else {
                            System.out.println("Invalid deposit amount.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter withdrawal amount:");
                        int withdraw = scanner.nextInt();

                        if (withdraw <=0 || withdraw % 100 != 0){
                            System.out.println("Invalid withdrawal amount!");
                        }
                        else if (withdraw > balance) {
                            System.out.println("Insufficient balance");
                        }
                        else {
                            balance = balance - withdraw;
                            t1 = t2;
                            t2 = t3;
                            t3 = -withdraw;

                            System.out.println("Withdrawal Successful");
                            System.out.println("Remaining Balance: " + balance);
                        }
                        break;
                    case 4 :
                        System.out.println("=== MINI STATEMENT ===");

                        for (int i = 1; i <=3; i++) {
                            if (i == 1){
                                System.out.println("Transaction " + i + " : " + t1);
                            } else if (i == 2) {
                                System.out.println("Transaction " + i + " : " + t2);
                            } else {
                                System.out.println("Transaction " + i + " : " + t3);
                            }
                        }
                        break;
                    case 5 :
                        System.out.println("Thank You for banking with us.");
                        break;
                    default :
                        System.out.println("Invalid Choice.");
                }
            }
            while (choice !=5);
        }

    }
}
