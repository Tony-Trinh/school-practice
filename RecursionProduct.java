/**
 *Tony Trinh
 * December 2, 2025
 * Assignment 19
 * This program uses recursion to multiply all numbers from 5 up to the user’s
 * number and shows the result and recursion depth.
 */

package java2.fall2025;

import java.util.Scanner;

public class RecursionProduct {

    // Counts how many times the method calls itself
    static int depth = 0;

    // Returns the product of all numbers from 5 to n using recursion
    public static long calcProd(int n) {
        depth++; // increase depth each call

        if (n == 5) {      // base case: when n reaches 5, stop
            return 5;      // return 5
        }

        return n * calcProd(n - 1);  // multiply n with product of smaller numbers
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;  // user input number

        // Loop until user enters a number >= 5
        do {
            System.out.print("Enter a number 5 or greater: "); // ask user
            number = input.nextInt(); // read number

            if (number < 5) { // check if number too small
                System.out.println("Error: number must be at least 5.\n");
            }

        } while (number < 5); // repeat until valid

        depth = 0; // reset depth before calling method

        long result = calcProd(number); // call method and get product

        // Show results to the user
        System.out.println("\n===== RESULTS =====");
        System.out.println("Number entered: " + number);            // show input
        System.out.println("Product from 5 to " + number + ": " + result); // show result
        System.out.println("Recursion depth: " + depth);            // show depth
    }
}
