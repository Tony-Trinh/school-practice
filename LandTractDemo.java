package java1.summer2025;
import java.util.Scanner;  // Import Scanner

/**
 * This program demonstrates the LandTract class.
 * It lets the user enter two tracts of land, shows their info,
 * and checks if they are the same size.
 * 
 * @author Tony Trinh
 */
public class LandTractDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create Scanner
        
        // Get first land tract dimensions
        System.out.println("Enter length for first tract: ");
        double length1 = input.nextDouble();    // Get user's length1
        System.out.println("Enter width for first tract: ");
        double width1 = input.nextDouble();     // Get user's width1
        
        
        // Get second land tract dimensions
        System.out.println("Enter length for second tract: ");
        double length2 = input.nextDouble();    // Get user's length2
        System.out.println("Enter width for second tract: ");
        double width2 = input.nextDouble();     // Get user's width2
        
        
        // Create LandTract objects
        LandTract tract1 = new LandTract(length1, width1);
        LandTract tract2 = new LandTract(length2, width2);
        
        // Display land tract info
        System.out.println("\nFirst Tract: " + tract1);
        System.out.println("Second Tract: " + tract2);
        
        // Check if areas are equal
        if (tract1.equals(tract2)) {
            System.out.println("The two tracts are equal in size.");
        } else {
            System.out.println("The two tracts are not equal in size.");
        }
        
    }
    
}
