import java.util.Scanner;

public class UserInputSumLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number:");
        int userInput1 = scanner.nextInt();

       // int num = 234;
        int sum=0;
        while (userInput1 > 0){
            sum += userInput1%10;
            userInput1 = userInput1/10;
        }
        System.out.println("Sum is" + " " + sum);
    }
}
