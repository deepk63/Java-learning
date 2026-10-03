package practice;

import java.util.Scanner;

public class IvrSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to IVR");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        int language = scanner.nextInt();
        boolean exit = false;


while (!exit){
            switch (language) {
                case 1:
                    System.out.println("1.Balance Enquiry.");
                    System.out.println("2.Money Transfer.");
                    System.out.println("3.Bill Payment.");
                    System.out.println("4.Exit");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Your Balance is $1000.");
                            break;
                        case 2:
                            System.out.println("Money has been transferred.");
                            break;
                        case 3:
                            System.out.println("Bill Payment has been received.");
                            break;
                        case 4:
                            System.out.println("Do you want to Exit:");
                            System.out.println("1.Yes");
                            System.out.println("2.No");
                            int inputOption = scanner.nextInt();
                            switch (inputOption){
                                case 1:
                                    System.out.println("Thank You.");
                                    exit = true;
                                    break;
                                case 2:
                                    System.out.println("Returning to main menu.");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid Choice.");
                    }
                    break;
                case 2:
                    System.out.println("Bonjour.");
                    break;
                default:
                    System.out.println("Invalid Language.");
            }

        }
    }
}