import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {
        int a = -4; // for positive/negative and even/odd.
        int age= 19; // for eligibility to drive.

        if (a >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }

        if (a % 2 == 0) {
            System.out.println("Number is Even");

        } else {
            System.out.println("Number is Odd");
        }

        if ( age >= 18) {
            System.out.println("Eligible to Drive");
        }
            else {
                System.out.println("Not Eligible to Drive");
            }
        }
}



