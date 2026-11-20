// Tony Trinh
// September 15, 2025
// Assignment 4
// This program tests if a user's password follows the rules:
// at least 10 characters, contains uppercase, lowercase, digit, and symbol.

package java2.fall2025;
import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { // loop until valid password or quit
            System.out.print("Enter a password (or type QUIT to exit): ");
            String pass = input.nextLine(); // Hold password input

            if (pass.equalsIgnoreCase("QUIT")) { // let user quit
                System.out.println("Program ended.");
                break;
            }

            boolean valid = true; // assume valid, check rules

            if (pass.length() < 10) { // check length
                System.out.println("- Must be at least 10 characters long");
                valid = false;
            }
            if (!pass.matches(".*[A-Z].*")) {  // check uppercase
                System.out.println("- Must contain at least one uppercase letter");
                valid = false;
            }
            if (!pass.matches(".*[a-z].*")) {  // check lowercase
                System.out.println("- Must contain at least one lowercase letter");
                valid = false;
            }
            if (!pass.matches(".*[0-9].*")) {  // check digit
                System.out.println("- Must contain at least one digit (0-9)");
                valid = false;
            }
            if (!pass.matches(".*[!?#$%].*")) {  // check symbol
                System.out.println("- Must contain at least one symbol (! ? # $ %)");
                valid = false;
            }

            if (valid) {  // if all rules passed
                System.out.println("Your password is valid");
                break;
            }
        }

        input.close(); // close scanner
    }
}
