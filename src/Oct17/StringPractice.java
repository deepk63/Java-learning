package Oct17;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        String reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = scanner.nextLine(); // String literal

        for (int i = s.length() - 1; i >= 0; i-- ) {
            reverse = reverse + s.charAt(i);
        }

        System.out.println("Reversed: " + reverse);

        if (s.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: Yes");
        }
        else {
            System.out.println("Palindrome: No");
        }

//          System.out.println("Palindrome: " + s.equalsIgnoreCase(reversed));


//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.chars());
//        System.out.println(s.charAt(1));
//        System.out.println(s.concat(" world"));
//        System.out.println(s.equals(s1));


    }
}
