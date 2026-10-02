import java.util.Scanner;

public class ContinueBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;

        for (int i = 1; i <= 10; i++){

            System.out.println("Enter "+i+ " Numbers:");
            int num = scanner.nextInt();
            if (num == 0) {
                continue;
            }
            if (num < 0) {
                break;
            }
            sum = sum + num;

    }
        System.out.println("Total:" + sum);

    }
}
