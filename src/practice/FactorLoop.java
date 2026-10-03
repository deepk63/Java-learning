package practice;

import java.util.Scanner;

public class FactorLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = scanner.nextInt();
        // int j=1;
        for (int i = 1; i <=10; i++ ) {
            System.out.println(""+i+"*"+n+ "="+i*n);

        }


    }
}
