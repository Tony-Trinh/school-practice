// Tony Trinh
// October 7, 2025
// Assignment 10
// This program asks the user to enter 10 integers,
// writes them to a file, and then reads them back into intTestArray.

package java2.fall2025;
import java.io.*;     // For file input/output
import java.util.Scanner;  // For user input

public class FileArrayTest {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in); // Create a Scanner for input

        final int size = 10;                // Number of integers to store
        int[] numbers = new int[size];      // Array for user input
        int[] intTestArray = new int[size]; // Array for reading from file (as required)
        String fileName = "myIntTest.txt";  // File name to save and read

        // Write array to file
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = keyboard.nextInt(); // Store each number in the array
        }

        // Write the array to the file
        FileArray.writeArray(fileName, numbers);
        System.out.println("\nArray written to " + fileName);

        // Part 2: Read file contents into intTestArray 
        FileArray.readArray(fileName, intTestArray);

        // Show the array that was read from the file
        System.out.println("\nArray read from file:");
        for (int value : intTestArray) {
            System.out.print(value + " ");
        }

        // Close the Scanner
        keyboard.close();
    }
}

