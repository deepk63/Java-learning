package oct20;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine().toLowerCase();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
            }
        }
    }
}
