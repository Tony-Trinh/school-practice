//Tony Trinh
//September 3, 2025
//Assignment 1
//This demo class to test Odometer object with user input.

package java2.fall2025;

import java.util.Scanner;

public class OdometerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "Yes";
        
        // Loop begins: keeps running until the user says "No"
        while (again.equalsIgnoreCase("Yes")) {
            // Create new Odometer object
            Odometer trip = new Odometer();
            
            // Ask for miles driven
            System.out.println("Enter miles driven: ");
            double miles = input.nextDouble();
            trip.addMiles(miles);   // Add to odometer
            
            // Ask for MPG
            System.out.println("Enter miles per gallon (MPG): ");
            double mpg = input.nextDouble();
            trip.setMPG(mpg);   // Set fuel efficiency
            
            input.nextLine();  // Clear the newline character from the buffer
            
            // Show result
            System.out.println("Odometer Report:");
            System.out.println(trip);    // Implicitly calls toString()

            
            // Reset values
            trip.resetMPG();
            trip.resetMiles();
            
            // Show after reset
            System.out.println("After Reset:");
            System.out.println(trip);    // Implicitly calls toString()

            
            // Ask user if they want to run again
            System.out.println("Do you want to create another Odometer? (Yes/No): ");
            again = input.nextLine();
            
        } 
        
        // End message
        System.out.println("Thank you! Program ended.");
    }
}
