package oct20;

import java.util.Scanner;

public class Sentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s = scanner.nextLine();

        String[] words = s.split(" ");
        String longest = words[0];

        for (int i = 0; i < words.length; i++ )  {
            System.out.println(words[i] + " : " + words[i].length());

            if (words[i].length() > longest.length()){
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
