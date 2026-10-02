import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n = scanner.nextInt();

        System.out.println("Enter 2st number");
        int n1 = scanner.nextInt();

        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(n+n1);
                break;
            case 2:
                System.out.println(n-n1);
                break;
            case 3:
                System.out.println(n*n1);
                break;
            case 4:
                System.out.println(n/n1);
                break;
            default:
                System.out.println("Invalid Choice.");

        }
    }
}
