import java.util.Scanner;

public class IvrIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to IVR.");
        System.out.println("Press 1 for English.");
        System.out.println("Press 2 for French.");
        int language = scanner.nextInt();

        if (language == 1) {
            System.out.println("Press 1 for Balance Enquiry.");
            System.out.println("Press 2 for Bill Payments.");
            System.out.println("Press 3 for Money Transfer.");
            int userInput1 = scanner.nextInt();

            if (userInput1 == 1) {
                System.out.println("Your Balance is $1000.");
            } else if (userInput1 == 2) {
                System.out.println("Bill Payment has been received.");
            } else if (userInput1 == 3) {
                System.out.println("Money has been transferred.");
            } else {
                System.out.println("Invalid option.");
            }
        }
        else if (language == 2){
            System.out.println("Bonjour.");
        }
        else {
            System.out.println("Invalid Language.");
        }

    }
}